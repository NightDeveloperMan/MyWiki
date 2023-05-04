
package ru.russianprogramer.usue.models.dissassemly.models;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class DocumentEditor {

    private enum VariableType {
        WRITEOFF("со списанием"), // списание
        TRANSFER("с передачей");// передача
        private final String type;

        VariableType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return type;
        }
    }

    private VariableType variable; // операция
    private String responsiblePerson; // МОЛ
    private HashMap<String, Kit> complectMap = new HashMap<String, Kit>();// комплекты


    public DocumentEditor(String variable, String responsiblePerson) {
        this.variable = VariableType.valueOf(variable);
        this.responsiblePerson = responsiblePerson;

    }

    public DocumentEditor() {
    }

    public HashMap<String, Kit> addNewComplect()
    {
        Kit complect = new Kit();
        this.complectMap.put(complect.getKitName(), complect);
        return complectMap;
    }


    public VariableType getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = VariableType.valueOf(variable);
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public HashMap<String, Kit> getComplectMap() {
        return complectMap;
    }

    public void setComplectMap(HashMap<String, Kit> complectMap) {
        this.complectMap = complectMap;
    }

}


//        Document doc = new Document("src/main/java/ru/usue/sourse/resourses/dissassemly.docx");
//        doc.getRange().replace("variable", variable.toString(), new FindReplaceOptions(FindReplaceDirection.FORWARD));
//        doc.getRange().replace("complectName", complect.getComplectName(), new FindReplaceOptions(FindReplaceDirection.FORWARD));
//        doc.getRange().replace("responsiblePerson", responsiblePerson, new FindReplaceOptions(FindReplaceDirection.FORWARD));
//        doc.getRange().replace("inventoryNumber", inventoryNumber.toString(), new FindReplaceOptions(FindReplaceDirection.FORWARD));
//        doc.getRange().replace("complectCost", complectCost.toString(), new FindReplaceOptions(FindReplaceDirection.FORWARD));
//        doc.getRange().replace("deviceName", device.getDeviceName(), new FindReplaceOptions(FindReplaceDirection.FORWARD));
//        doc.getRange().replace("deviceCost", String.valueOf(device.getDeviceCost()), new FindReplaceOptions(FindReplaceDirection.FORWARD));
//        doc.getRange().replace("deviceType", device.getType(), new FindReplaceOptions(FindReplaceDirection.FORWARD));
//        doc.save("D://test/dissassemly.docx");