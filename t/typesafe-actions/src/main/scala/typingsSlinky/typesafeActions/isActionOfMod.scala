package typingsSlinky.typesafeActions

import typingsSlinky.typesafeActions.anon.TypeString
import typingsSlinky.typesafeActions.typeHelpersMod.TypeMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/is-action-of", JSImport.Namespace)
@js.native
object isActionOfMod extends js.Object {
  def isActionOf[AC /* <: ActionCreator[TypeString] */](actionCreator: AC): js.Function1[/* action */ TypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: ActionCreator[TypeString] */](actionCreator: AC, action: TypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  def isActionOf[AC /* <: ActionCreator[TypeString] */](actionCreator: js.Array[AC]): js.Function1[/* action */ TypeString, /* is std.ReturnType<AC> */ Boolean] = js.native
  def isActionOf[AC /* <: ActionCreator[TypeString] */](actionCreator: js.Array[AC], action: TypeString): /* is std.ReturnType<AC> */ Boolean = js.native
  type ActionCreator[T /* <: TypeString */] = (js.Function1[/* repeated */ js.Any, T]) with (TypeMeta[
    /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any
  ])
}

