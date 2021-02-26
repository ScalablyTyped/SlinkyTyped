package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceType
  extends AbstractContainer
     with IDLRootType {
  
  /** A string giving the name of an interface this one inherits from, null otherwise. */
  var inheritance: String | Null = js.native
  
  @JSName("members")
  var members_InterfaceType: js.Array[IDLInterfaceMemberType] = js.native
  
  @JSName("parent")
  var parent_InterfaceType: Null = js.native
  
  @JSName("type")
  var type_InterfaceType: interface = js.native
}
object InterfaceType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    members: js.Array[IDLInterfaceMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: interface
  ): InterfaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceType]
  }
  
  @scala.inline
  implicit class InterfaceTypeMutableBuilder[Self <: InterfaceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInheritance(value: String): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritanceNull: Self = StObject.set(x, "inheritance", null)
    
    @scala.inline
    def setMembers(value: js.Array[IDLInterfaceMemberType]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: IDLInterfaceMemberType*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: interface): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
