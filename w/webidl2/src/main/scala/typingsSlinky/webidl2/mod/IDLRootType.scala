package typingsSlinky.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webidl2.mod.InterfaceType
  - typingsSlinky.webidl2.mod.InterfaceMixinType
  - typingsSlinky.webidl2.mod.NamespaceType
  - typingsSlinky.webidl2.mod.CallbackType
  - typingsSlinky.webidl2.mod.DictionaryType
  - typingsSlinky.webidl2.mod.EnumType
  - typingsSlinky.webidl2.mod.TypedefType
  - typingsSlinky.webidl2.mod.IncludesType
*/
trait IDLRootType extends js.Object

object IDLRootType {
  @scala.inline
  implicit def apply(value: CallbackType): IDLRootType = value.asInstanceOf[IDLRootType]
  @scala.inline
  implicit def apply(value: DictionaryType): IDLRootType = value.asInstanceOf[IDLRootType]
  @scala.inline
  implicit def apply(value: EnumType): IDLRootType = value.asInstanceOf[IDLRootType]
  @scala.inline
  implicit def apply(value: IncludesType): IDLRootType = value.asInstanceOf[IDLRootType]
  @scala.inline
  implicit def apply(value: InterfaceMixinType): IDLRootType = value.asInstanceOf[IDLRootType]
  @scala.inline
  implicit def apply(value: InterfaceType): IDLRootType = value.asInstanceOf[IDLRootType]
  @scala.inline
  implicit def apply(value: NamespaceType): IDLRootType = value.asInstanceOf[IDLRootType]
  @scala.inline
  implicit def apply(value: TypedefType): IDLRootType = value.asInstanceOf[IDLRootType]
}

