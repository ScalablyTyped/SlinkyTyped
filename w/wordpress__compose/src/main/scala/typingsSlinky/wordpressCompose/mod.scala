package typingsSlinky.wordpressCompose

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressCompose.anon.kinkeyofWindowEventMapstr
import typingsSlinky.wordpressCompose.wordpressComposeStrings.instanceId
import typingsSlinky.wordpressCompose.wordpressComposeStrings.setState
import typingsSlinky.wordpressCompose.wordpressComposeStrings.setTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/compose", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  def createHigherOrderComponent[EP](
    mapComponentToEnhancedComponent: js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]],
    modifierName: String
  ): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[_, /* keyof EP */ String]]
  ] = js.native
  def ifCondition[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[/* component */ ReactComponentClass[P], ReactComponentClass[P]] = js.native
  // prettier-ignore
  def pure[T /* <: ReactComponentClass[_] */](component: T): ReactComponentClass[_] = js.native
  def useMediaQuery(query: String): Boolean = js.native
  def useReducedMotion(): Boolean = js.native
  // prettier-ignore
  def withGlobalEvents(eventMapper: kinkeyofWindowEventMapstr): js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]] = js.native
  // prettier-ignore
  def withInstanceId[T /* <: ReactComponentClass[_] */](wrapped: T): ReactComponentClass[Omit[_, instanceId]] = js.native
  // prettier-ignore
  def withSafeTimeout[T /* <: ReactComponentClass[_] */](component: T): ReactComponentClass[Omit[_, setTimeout]] = js.native
  // prettier-ignore
  def withState[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typingsSlinky.wordpressCompose.wordpressComposeStrings.withState with TopLevel[SP]
  ): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[_, (/* keyof SP */ String) | setState]]
  ] = js.native
}

