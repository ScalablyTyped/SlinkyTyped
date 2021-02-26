package typingsSlinky.useDeepCompareEffect

import typingsSlinky.react.mod.DependencyList
import typingsSlinky.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  /* was `typeof useEffect` */
  @JSImport("use-deep-compare-effect", JSImport.Default)
  @js.native
  def default(effect: EffectCallback): Unit = js.native
  /* was `typeof useEffect` */
  @JSImport("use-deep-compare-effect", JSImport.Default)
  @js.native
  def default(effect: EffectCallback, deps: DependencyList): Unit = js.native
  
  @JSImport("use-deep-compare-effect", "useDeepCompareEffectNoCheck")
  @js.native
  def useDeepCompareEffectNoCheck(effect: EffectCallback): Unit = js.native
  @JSImport("use-deep-compare-effect", "useDeepCompareEffectNoCheck")
  @js.native
  def useDeepCompareEffectNoCheck(effect: EffectCallback, deps: DependencyList): Unit = js.native
}
