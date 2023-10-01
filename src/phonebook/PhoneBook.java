package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    List<Note> notes;

    public static void add(List<Note> notes, Note note){
        notes.add(note);
    }
    public static Note find(List<Note> notes , String str){
        for(Note note:notes){
            if (note.getName().equals(str)){
                return note;
            }
        }
        return null;
    }
    public static List<Note> findAll(List<Note> notes , String str){

        List<Note> arrayList = new ArrayList<>();
        for (Note s : notes) {
            String s1= s.getName();
            if (s1.contains(str)) {
                arrayList.add(s);
            }
        }
        if(!arrayList.isEmpty()){
            return arrayList;
        }
        return null;

    }
}
