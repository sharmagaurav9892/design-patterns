package sold_principles.interfacesegregation.good;
//Here dont need to bother about db part.
public class FileDaoConnection implements FileInterface,DAOInterface{
    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openFile() {

    }
}
