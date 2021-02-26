package typingsSlinky.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Workflow {
  
  @js.native
  trait WorkflowAssociation extends ClientObject {
    
    def deleteObject(): Unit = js.native
    
    def get_allowManual(): Boolean = js.native
    
    def get_associationData(): String = js.native
    
    def get_autoStartChange(): Boolean = js.native
    
    def get_autoStartCreate(): Boolean = js.native
    
    def get_baseId(): Guid = js.native
    
    def get_created(): js.Date = js.native
    
    def get_description(): String = js.native
    
    def get_enabled(): Boolean = js.native
    
    def get_historyListTitle(): String = js.native
    
    def get_id(): Guid = js.native
    
    def get_instantiationUrl(): String = js.native
    
    def get_internalName(): String = js.native
    
    def get_isDeclarative(): Boolean = js.native
    
    def get_listId(): Guid = js.native
    
    def get_modified(): js.Date = js.native
    
    def get_name(): String = js.native
    
    def get_taskListTitle(): String = js.native
    
    def get_webId(): Guid = js.native
    
    def set_allowManual(value: Boolean): Unit = js.native
    
    def set_associationData(value: String): Unit = js.native
    
    def set_autoStartChange(value: Boolean): Unit = js.native
    
    def set_autoStartCreate(value: Boolean): Unit = js.native
    
    def set_description(value: String): Unit = js.native
    
    def set_enabled(value: Boolean): Unit = js.native
    
    def set_historyListTitle(value: String): Unit = js.native
    
    def set_name(value: String): Unit = js.native
    
    def set_taskListTitle(value: String): Unit = js.native
    
    def update(): Unit = js.native
  }
  
  @js.native
  trait WorkflowAssociationCollection extends ClientObjectCollection[WorkflowAssociation] {
    
    def add(parameters: WorkflowAssociationCreationInformation): WorkflowAssociation = js.native
    
    def getById(associationId: Guid): WorkflowAssociation = js.native
    
    def getByName(name: String): WorkflowAssociation = js.native
    
    def get_item(index: Double): WorkflowAssociation = js.native
    
    def itemAt(index: Double): WorkflowAssociation = js.native
  }
  
  @js.native
  trait WorkflowAssociationCreationInformation extends ClientValueObject {
    
    def get_contentTypeAssociationHistoryListName(): String = js.native
    
    def get_contentTypeAssociationTaskListName(): String = js.native
    
    def get_historyList(): List[_] = js.native
    
    def get_name(): String = js.native
    
    def get_taskList(): List[_] = js.native
    
    def get_template(): WorkflowTemplate = js.native
    
    def set_contentTypeAssociationHistoryListName(value: String): Unit = js.native
    
    def set_contentTypeAssociationTaskListName(value: String): Unit = js.native
    
    def set_historyList(value: List[_]): Unit = js.native
    
    def set_name(value: String): Unit = js.native
    
    def set_taskList(value: List[_]): Unit = js.native
    
    def set_template(value: WorkflowTemplate): Unit = js.native
  }
  object WorkflowAssociationCreationInformation {
    
    @scala.inline
    def apply(
      customFromJson: js.Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: js.Any => Unit,
      get_contentTypeAssociationHistoryListName: () => String,
      get_contentTypeAssociationTaskListName: () => String,
      get_historyList: () => List[_],
      get_name: () => String,
      get_taskList: () => List[_],
      get_template: () => WorkflowTemplate,
      get_typeId: () => String,
      set_contentTypeAssociationHistoryListName: String => Unit,
      set_contentTypeAssociationTaskListName: String => Unit,
      set_historyList: List[_] => Unit,
      set_name: String => Unit,
      set_taskList: List[_] => Unit,
      set_template: WorkflowTemplate => Unit,
      writeToXml: (XmlWriter, SerializationContext) => Unit
    ): WorkflowAssociationCreationInformation = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_contentTypeAssociationHistoryListName = js.Any.fromFunction0(get_contentTypeAssociationHistoryListName), get_contentTypeAssociationTaskListName = js.Any.fromFunction0(get_contentTypeAssociationTaskListName), get_historyList = js.Any.fromFunction0(get_historyList), get_name = js.Any.fromFunction0(get_name), get_taskList = js.Any.fromFunction0(get_taskList), get_template = js.Any.fromFunction0(get_template), get_typeId = js.Any.fromFunction0(get_typeId), set_contentTypeAssociationHistoryListName = js.Any.fromFunction1(set_contentTypeAssociationHistoryListName), set_contentTypeAssociationTaskListName = js.Any.fromFunction1(set_contentTypeAssociationTaskListName), set_historyList = js.Any.fromFunction1(set_historyList), set_name = js.Any.fromFunction1(set_name), set_taskList = js.Any.fromFunction1(set_taskList), set_template = js.Any.fromFunction1(set_template), writeToXml = js.Any.fromFunction2(writeToXml))
      __obj.asInstanceOf[WorkflowAssociationCreationInformation]
    }
    
    @scala.inline
    implicit class WorkflowAssociationCreationInformationMutableBuilder[Self <: WorkflowAssociationCreationInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet_contentTypeAssociationHistoryListName(value: () => String): Self = StObject.set(x, "get_contentTypeAssociationHistoryListName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_contentTypeAssociationTaskListName(value: () => String): Self = StObject.set(x, "get_contentTypeAssociationTaskListName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_historyList(value: () => List[_]): Self = StObject.set(x, "get_historyList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_taskList(value: () => List[_]): Self = StObject.set(x, "get_taskList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet_template(value: () => WorkflowTemplate): Self = StObject.set(x, "get_template", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet_contentTypeAssociationHistoryListName(value: String => Unit): Self = StObject.set(x, "set_contentTypeAssociationHistoryListName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_contentTypeAssociationTaskListName(value: String => Unit): Self = StObject.set(x, "set_contentTypeAssociationTaskListName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_historyList(value: List[_] => Unit): Self = StObject.set(x, "set_historyList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_name(value: String => Unit): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_taskList(value: List[_] => Unit): Self = StObject.set(x, "set_taskList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet_template(value: WorkflowTemplate => Unit): Self = StObject.set(x, "set_template", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WorkflowTemplate extends ClientObject {
    
    def get_allowManual(): Boolean = js.native
    
    def get_associationUrl(): String = js.native
    
    def get_autoStartChange(): Boolean = js.native
    
    def get_autoStartCreate(): Boolean = js.native
    
    def get_description(): String = js.native
    
    def get_id(): Guid = js.native
    
    def get_isDeclarative(): Boolean = js.native
    
    def get_name(): String = js.native
    
    def get_permissionsManual(): BasePermissions = js.native
  }
  
  @js.native
  trait WorkflowTemplateCollection extends ClientObjectCollection[WorkflowTemplate] {
    
    def getById(templateId: Guid): WorkflowTemplate = js.native
    
    def getByName(name: String): WorkflowTemplate = js.native
    
    def get_item(index: Double): WorkflowTemplate = js.native
    
    def itemAt(index: Double): WorkflowTemplate = js.native
  }
}
