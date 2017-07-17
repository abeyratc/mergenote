package note.services;

import org.springframework.beans.factory.annotation.Autowired;

import note.beans.Note;
import note.beans.Result;
import note.dao.NotesMapper;

public class NotesServiceImpl implements NotesService {

	@Autowired
	NotesMapper notesMapper;

	@Override
	public Result insertNote(Note note) {
		Result finalResult = new Result();
		try {
			Integer returnedId = notesMapper.insert(note);
			if (returnedId > 1) {
				finalResult.setStatus("OK");
				finalResult.setReason(note.getRevision().length + " rows successfully inserted!");
			}
		} catch (Exception e) {
			finalResult.setStatus("FAILED");
			finalResult.setReason("Insert failed due to " + e.getCause().getMessage());
		}
		return finalResult;
	}
}
