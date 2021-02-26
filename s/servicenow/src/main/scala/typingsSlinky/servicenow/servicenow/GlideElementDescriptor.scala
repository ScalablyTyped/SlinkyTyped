package typingsSlinky.servicenow.servicenow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlideElementDescriptor extends StObject {
  
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
  implicit class GlideElementDescriptorMutableBuilder[Self <: GlideElementDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAttachmentEncryptionType(value: () => String): Self = StObject.set(x, "getAttachmentEncryptionType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEncryptionType(value: () => String): Self = StObject.set(x, "getEncryptionType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInternalType(value: () => String): Self = StObject.set(x, "getInternalType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPlural(value: () => Boolean): Self = StObject.set(x, "getPlural", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAttachmentsEncrypted(value: () => Boolean): Self = StObject.set(x, "hasAttachmentsEncrypted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAutoOrSysID(value: () => Boolean): Self = StObject.set(x, "isAutoOrSysID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsChoiceTable(value: () => Boolean): Self = StObject.set(x, "isChoiceTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEdgeEncrypted(value: () => Boolean): Self = StObject.set(x, "isEdgeEncrypted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVirtual(value: () => Boolean): Self = StObject.set(x, "isVirtual", js.Any.fromFunction0(value))
  }
}
