package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackType extends IDLRootType {
  
  /** A list of arguments, as in function paramters. */
  var arguments: js.Array[Argument] = js.native
  
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttribute] = js.native
  
  /** An IDL Type describing what the callback returns. */
  var idlType: IDLTypeDescription = js.native
  
  /** The name of the callback. */
  var name: String = js.native
  
  var `type`: callback = js.native
}
object CallbackType {
  
  @scala.inline
  def apply(
    arguments: js.Array[Argument],
    extAttrs: js.Array[ExtendedAttribute],
    idlType: IDLTypeDescription,
    name: String,
    `type`: callback
  ): CallbackType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackType]
  }
  
  @scala.inline
  implicit class CallbackTypeOps[Self <: CallbackType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgumentsVarargs(value: Argument*): Self = this.set("arguments", js.Array(value :_*))
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtAttrsVarargs(value: ExtendedAttribute*): Self = this.set("extAttrs", js.Array(value :_*))
    
    @scala.inline
    def setExtAttrs(value: js.Array[ExtendedAttribute]): Self = this.set("extAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdlType(value: IDLTypeDescription): Self = this.set("idlType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: callback): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
