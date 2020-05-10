package typingsSlinky.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideElementDescriptor extends js.Object {
  def getAttachmentEncryptionType(): String = js.native
  def getEncryptionType(): String = js.native
  def getInternalType(): String = js.native
  def getLabel(): String = js.native
  def getLength(): Double = js.native
  def getName(): String = js.native
  def getPlural(): Boolean = js.native
  def hasAttachmentsEncrypted(): Boolean = js.native
  def isAutoOrSysID(): Boolean = js.native
  def isChoiceTable(): Boolean = js.native
  def isEdgeEncrypted(): Boolean = js.native
  def isVirtual(): Boolean = js.native
}

object GlideElementDescriptor {
  @scala.inline
  def apply(
    getAttachmentEncryptionType: () => String,
    getEncryptionType: () => String,
    getInternalType: () => String,
    getLabel: () => String,
    getLength: () => Double,
    getName: () => String,
    getPlural: () => Boolean,
    hasAttachmentsEncrypted: () => Boolean,
    isAutoOrSysID: () => Boolean,
    isChoiceTable: () => Boolean,
    isEdgeEncrypted: () => Boolean,
    isVirtual: () => Boolean
  ): GlideElementDescriptor = {
    val __obj = js.Dynamic.literal(getAttachmentEncryptionType = js.Any.fromFunction0(getAttachmentEncryptionType), getEncryptionType = js.Any.fromFunction0(getEncryptionType), getInternalType = js.Any.fromFunction0(getInternalType), getLabel = js.Any.fromFunction0(getLabel), getLength = js.Any.fromFunction0(getLength), getName = js.Any.fromFunction0(getName), getPlural = js.Any.fromFunction0(getPlural), hasAttachmentsEncrypted = js.Any.fromFunction0(hasAttachmentsEncrypted), isAutoOrSysID = js.Any.fromFunction0(isAutoOrSysID), isChoiceTable = js.Any.fromFunction0(isChoiceTable), isEdgeEncrypted = js.Any.fromFunction0(isEdgeEncrypted), isVirtual = js.Any.fromFunction0(isVirtual))
    __obj.asInstanceOf[GlideElementDescriptor]
  }
  @scala.inline
  implicit class GlideElementDescriptorOps[Self <: GlideElementDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAttachmentEncryptionType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttachmentEncryptionType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEncryptionType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEncryptionType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInternalType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInternalType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabel(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPlural(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlural")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasAttachmentsEncrypted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttachmentsEncrypted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAutoOrSysID(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutoOrSysID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsChoiceTable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChoiceTable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEdgeEncrypted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEdgeEncrypted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsVirtual(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVirtual")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

