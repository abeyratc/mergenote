package note.dao;

import org.apache.ibatis.annotations.Param;

import note.beans.Note;

public interface NotesMapper {

	Integer insert(@Param("note")Note note) throws Exception;
}
