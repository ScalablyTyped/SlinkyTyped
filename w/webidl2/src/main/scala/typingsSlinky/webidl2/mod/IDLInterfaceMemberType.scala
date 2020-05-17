package typingsSlinky.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.OperationMemberType
  - typingsSlinky.webidl2.mod.ConstructorMemberType
  - typingsSlinky.webidl2.mod.AttributeMemberType
  - typingsSlinky.webidl2.mod.ConstantMemberType
  - typingsSlinky.webidl2.mod.DeclarationMemberType
*/
trait IDLInterfaceMemberType extends js.Object

object IDLInterfaceMemberType {
  @scala.inline
  implicit def apply(value: AttributeMemberType): IDLInterfaceMemberType = value.asInstanceOf[IDLInterfaceMemberType]
  @scala.inline
  implicit def apply(value: ConstantMemberType): IDLInterfaceMemberType = value.asInstanceOf[IDLInterfaceMemberType]
  @scala.inline
  implicit def apply(value: ConstructorMemberType): IDLInterfaceMemberType = value.asInstanceOf[IDLInterfaceMemberType]
  @scala.inline
  implicit def apply(value: DeclarationMemberType): IDLInterfaceMemberType = value.asInstanceOf[IDLInterfaceMemberType]
  @scala.inline
  implicit def apply(value: OperationMemberType): IDLInterfaceMemberType = value.asInstanceOf[IDLInterfaceMemberType]
}

