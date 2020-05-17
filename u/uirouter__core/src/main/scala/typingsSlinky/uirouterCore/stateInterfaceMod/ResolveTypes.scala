package typingsSlinky.uirouterCore.stateInterfaceMod

import typingsSlinky.uirouterCore.resolvableMod.Resolvable
import typingsSlinky.uirouterCore.resolveInterfaceMod.ProviderLike
import typingsSlinky.uirouterCore.resolveInterfaceMod.ResolvableLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.uirouterCore.resolvableMod.Resolvable
  - typingsSlinky.uirouterCore.resolveInterfaceMod.ResolvableLiteral
  - typingsSlinky.uirouterCore.resolveInterfaceMod.ProviderLike
*/
trait ResolveTypes extends js.Object

object ResolveTypes {
  @scala.inline
  implicit def apply(value: ProviderLike): ResolveTypes = value.asInstanceOf[ResolveTypes]
  @scala.inline
  implicit def apply(value: Resolvable): ResolveTypes = value.asInstanceOf[ResolveTypes]
  @scala.inline
  implicit def apply(value: ResolvableLiteral): ResolveTypes = value.asInstanceOf[ResolveTypes]
}

