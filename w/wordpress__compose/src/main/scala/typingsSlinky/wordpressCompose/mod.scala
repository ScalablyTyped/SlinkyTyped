package typingsSlinky.wordpressCompose

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import typingsSlinky.wordpressCompose.anon.kinkeyofWindowEventMapstr
import typingsSlinky.wordpressCompose.wordpressComposeStrings.instanceId
import typingsSlinky.wordpressCompose.wordpressComposeStrings.setState
import typingsSlinky.wordpressCompose.wordpressComposeStrings.setTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable:no-unnecessary-generics
  // prettier-ignore
  @JSImport("@wordpress/compose", "createHigherOrderComponent")
  @js.native
  def createHigherOrderComponent[EP](
    mapComponentToEnhancedComponent: js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]],
    modifierName: String
  ): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[_, /* keyof EP */ String]]
  ] = js.native
  
  @JSImport("@wordpress/compose", "ifCondition")
  @js.native
  def ifCondition[P](predicate: js.Function1[/* props */ P, Boolean]): js.Function1[/* component */ ReactComponentClass[P], ReactComponentClass[P]] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "pure")
  @js.native
  def pure[T /* <: ReactComponentClass[_] */](component: T): ReactComponentClass[_] = js.native
  
  @JSImport("@wordpress/compose", "useMediaQuery")
  @js.native
  def useMediaQuery(query: String): Boolean = js.native
  
  @JSImport("@wordpress/compose", "useReducedMotion")
  @js.native
  def useReducedMotion(): Boolean = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "withGlobalEvents")
  @js.native
  def withGlobalEvents(eventMapper: kinkeyofWindowEventMapstr): js.Function1[/* component */ ReactComponentClass[_], ReactComponentClass[_]] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "withInstanceId")
  @js.native
  def withInstanceId[T /* <: ReactComponentClass[_] */](wrapped: T): ReactComponentClass[Omit[_, instanceId]] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "withSafeTimeout")
  @js.native
  def withSafeTimeout[T /* <: ReactComponentClass[_] */](component: T): ReactComponentClass[Omit[_, setTimeout]] = js.native
  
  // prettier-ignore
  @JSImport("@wordpress/compose", "withState")
  @js.native
  def withState[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof SP ]: SP[k]}
    */ typingsSlinky.wordpressCompose.wordpressComposeStrings.withState with TopLevel[SP]
  ): js.Function1[
    /* component */ ReactComponentClass[_], 
    ReactComponentClass[Omit[_, (/* keyof SP */ String) | setState]]
  ] = js.native
}
