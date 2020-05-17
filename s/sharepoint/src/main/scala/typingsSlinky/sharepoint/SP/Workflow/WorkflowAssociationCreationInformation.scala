package typingsSlinky.sharepoint.SP.Workflow

import typingsSlinky.sharepoint.SP.ClientValueObject
import typingsSlinky.sharepoint.SP.List
import typingsSlinky.sharepoint.SP.SerializationContext
import typingsSlinky.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class WorkflowAssociationCreationInformationOps[Self <: WorkflowAssociationCreationInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet_contentTypeAssociationHistoryListName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_contentTypeAssociationHistoryListName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_contentTypeAssociationTaskListName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_contentTypeAssociationTaskListName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_historyList(value: () => List[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_historyList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_name(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_name")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_taskList(value: () => List[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_taskList")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGet_template(value: () => WorkflowTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get_template")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet_contentTypeAssociationHistoryListName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_contentTypeAssociationHistoryListName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_contentTypeAssociationTaskListName(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_contentTypeAssociationTaskListName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_historyList(value: List[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_historyList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_name(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_name")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_taskList(value: List[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_taskList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet_template(value: WorkflowTemplate => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set_template")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

