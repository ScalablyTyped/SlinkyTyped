package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceType
  extends AbstractContainer
     with IDLRootType {
  
  var inheritance: Null = js.native
  
  @JSName("members")
  var members_NamespaceType: js.Array[IDLNamespaceMemberType] = js.native
  
  @JSName("parent")
  var parent_NamespaceType: Null = js.native
  
  @JSName("type")
  var type_NamespaceType: namespace = js.native
}
object NamespaceType {
  
  @scala.inline
  def apply(
    extAttrs: js.Array[ExtendedAttribute],
    inheritance: Null,
    members: js.Array[IDLNamespaceMemberType],
    name: String,
    parent: Null,
    partial: Boolean,
    `type`: namespace
  ): NamespaceType = {
    val __obj = js.Dynamic.literal(extAttrs = extAttrs.asInstanceOf[js.Any], inheritance = inheritance.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceType]
  }
  
  @scala.inline
  implicit class NamespaceTypeMutableBuilder[Self <: NamespaceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInheritance(value: Null): Self = StObject.set(x, "inheritance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[IDLNamespaceMemberType]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: IDLNamespaceMemberType*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: namespace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
