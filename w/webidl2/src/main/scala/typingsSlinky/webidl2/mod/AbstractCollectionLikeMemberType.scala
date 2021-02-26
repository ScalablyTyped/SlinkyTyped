package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Booleans.`false`
import typingsSlinky.webidl2.webidl2Strings.iterable
import typingsSlinky.webidl2.webidl2Strings.maplike
import typingsSlinky.webidl2.webidl2Strings.setlike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractCollectionLikeMemberType extends AbstractDeclarationMemberType {
  
  @JSName("arguments")
  var arguments_AbstractCollectionLikeMemberType: js.Array[js.Any] = js.native
  
  @JSName("async")
  var async_AbstractCollectionLikeMemberType: `false` = js.native
}
object AbstractCollectionLikeMemberType {
  
  @scala.inline
  def apply(
    arguments: js.Array[js.Any],
    async: `false`,
    extAttrs: js.Array[ExtendedAttribute],
    idlType: js.Array[IDLTypeDescription],
    parent: InterfaceMixinType | InterfaceType,
    readonly: Boolean,
    `type`: iterable | maplike | setlike
  ): AbstractCollectionLikeMemberType = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], extAttrs = extAttrs.asInstanceOf[js.Any], idlType = idlType.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractCollectionLikeMemberType]
  }
  
  @scala.inline
  implicit class AbstractCollectionLikeMemberTypeMutableBuilder[Self <: AbstractCollectionLikeMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[js.Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: js.Any*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setAsync(value: `false`): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
  }
}
