package typingsSlinky.xstyledSystem.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.xstyledSystem.anon.TypeofReact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xstyled/system", "createSystemComponent")
@js.native
object createSystemComponent extends js.Object {
  def apply[T](react: TypeofReact): // tslint:disable-next-line no-unnecessary-generics
  ReactComponentClass[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: js.UndefOr[ReactElement], system: StyleFunc): // tslint:disable-next-line no-unnecessary-generics
  ReactComponentClass[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: String): // tslint:disable-next-line no-unnecessary-generics
  ReactComponentClass[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: String, system: StyleFunc): // tslint:disable-next-line no-unnecessary-generics
  ReactComponentClass[T] = js.native
  def apply[T](react: TypeofReact, defaultComponent: ReactElement): // tslint:disable-next-line no-unnecessary-generics
  ReactComponentClass[T] = js.native
}

