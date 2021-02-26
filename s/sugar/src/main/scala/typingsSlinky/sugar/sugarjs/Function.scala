package typingsSlinky.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Function {
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typingsSlinky.sugar.sugarjs.Object.ChainableBase[RawValue]
  
  @js.native
  trait ChainableBase[RawValue] extends StObject {
    
    def after(n: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    @JSName("apply")
    def apply(thisArg: js.Any): SugarDefaultChainable[_] = js.native
    @JSName("apply")
    def apply(thisArg: js.Any, argArray: js.Any): SugarDefaultChainable[_] = js.native
    
    def bind(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
    
    def call(thisArg: js.Any, argArray: js.Any*): SugarDefaultChainable[_] = js.native
    
    def cancel(): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    def debounce(): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def debounce(ms: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    def delay(ms: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def delay(ms: Double, args: js.Any*): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    def every(ms: js.UndefOr[scala.Nothing], args: js.Any*): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def every(ms: Double, args: js.Any*): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    def `lazy`(): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def `lazy`(ms: js.UndefOr[scala.Nothing], immediate: js.UndefOr[scala.Nothing], limit: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def `lazy`(ms: js.UndefOr[scala.Nothing], immediate: Boolean): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def `lazy`(ms: js.UndefOr[scala.Nothing], immediate: Boolean, limit: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def `lazy`(ms: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: js.UndefOr[scala.Nothing], limit: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: Boolean): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def `lazy`(ms: Double, immediate: Boolean, limit: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    def lock(): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def lock(n: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    def memoize(): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def memoize(hashFn: js.UndefOr[scala.Nothing], limit: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def memoize(hashFn: java.lang.String): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def memoize(hashFn: java.lang.String, limit: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def memoize(hashFn: typingsSlinky.sugar.Function): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def memoize(hashFn: typingsSlinky.sugar.Function, limit: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    def once(): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    def partial(args: js.Any*): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    
    var raw: RawValue = js.native
    
    def throttle(): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
    def throttle(ms: Double): SugarDefaultChainable[typingsSlinky.sugar.Function] = js.native
  }
  
  @js.native
  trait Constructor
    extends SugarNamespace
       with Instantiable0[Chainable[typingsSlinky.sugar.Function]]
       with Instantiable1[/* raw */ typingsSlinky.sugar.Function, Chainable[typingsSlinky.sugar.Function]] {
    
    def apply(): Chainable[typingsSlinky.sugar.Function] = js.native
    def apply(raw: typingsSlinky.sugar.Function): Chainable[typingsSlinky.sugar.Function] = js.native
    
    def after(instance: typingsSlinky.sugar.Function, n: Double): typingsSlinky.sugar.Function = js.native
    
    def cancel(instance: typingsSlinky.sugar.Function): typingsSlinky.sugar.Function = js.native
    
    def debounce(instance: typingsSlinky.sugar.Function): typingsSlinky.sugar.Function = js.native
    def debounce(instance: typingsSlinky.sugar.Function, ms: Double): typingsSlinky.sugar.Function = js.native
    
    def delay(instance: typingsSlinky.sugar.Function, ms: js.UndefOr[scala.Nothing], args: js.Any*): typingsSlinky.sugar.Function = js.native
    def delay(instance: typingsSlinky.sugar.Function, ms: Double, args: js.Any*): typingsSlinky.sugar.Function = js.native
    
    def every(instance: typingsSlinky.sugar.Function, ms: js.UndefOr[scala.Nothing], args: js.Any*): typingsSlinky.sugar.Function = js.native
    def every(instance: typingsSlinky.sugar.Function, ms: Double, args: js.Any*): typingsSlinky.sugar.Function = js.native
    
    def `lazy`(instance: typingsSlinky.sugar.Function): typingsSlinky.sugar.Function = js.native
    def `lazy`(
      instance: typingsSlinky.sugar.Function,
      ms: js.UndefOr[scala.Nothing],
      immediate: js.UndefOr[scala.Nothing],
      limit: Double
    ): typingsSlinky.sugar.Function = js.native
    def `lazy`(instance: typingsSlinky.sugar.Function, ms: js.UndefOr[scala.Nothing], immediate: Boolean): typingsSlinky.sugar.Function = js.native
    def `lazy`(
      instance: typingsSlinky.sugar.Function,
      ms: js.UndefOr[scala.Nothing],
      immediate: Boolean,
      limit: Double
    ): typingsSlinky.sugar.Function = js.native
    def `lazy`(instance: typingsSlinky.sugar.Function, ms: Double): typingsSlinky.sugar.Function = js.native
    def `lazy`(
      instance: typingsSlinky.sugar.Function,
      ms: Double,
      immediate: js.UndefOr[scala.Nothing],
      limit: Double
    ): typingsSlinky.sugar.Function = js.native
    def `lazy`(instance: typingsSlinky.sugar.Function, ms: Double, immediate: Boolean): typingsSlinky.sugar.Function = js.native
    def `lazy`(instance: typingsSlinky.sugar.Function, ms: Double, immediate: Boolean, limit: Double): typingsSlinky.sugar.Function = js.native
    
    def lock(instance: typingsSlinky.sugar.Function): typingsSlinky.sugar.Function = js.native
    def lock(instance: typingsSlinky.sugar.Function, n: Double): typingsSlinky.sugar.Function = js.native
    
    def memoize(instance: typingsSlinky.sugar.Function): typingsSlinky.sugar.Function = js.native
    def memoize(instance: typingsSlinky.sugar.Function, hashFn: js.UndefOr[scala.Nothing], limit: Double): typingsSlinky.sugar.Function = js.native
    def memoize(instance: typingsSlinky.sugar.Function, hashFn: java.lang.String): typingsSlinky.sugar.Function = js.native
    def memoize(instance: typingsSlinky.sugar.Function, hashFn: java.lang.String, limit: Double): typingsSlinky.sugar.Function = js.native
    def memoize(instance: typingsSlinky.sugar.Function, hashFn: typingsSlinky.sugar.Function): typingsSlinky.sugar.Function = js.native
    def memoize(instance: typingsSlinky.sugar.Function, hashFn: typingsSlinky.sugar.Function, limit: Double): typingsSlinky.sugar.Function = js.native
    
    def once(instance: typingsSlinky.sugar.Function): typingsSlinky.sugar.Function = js.native
    
    def partial(instance: typingsSlinky.sugar.Function, args: js.Any*): typingsSlinky.sugar.Function = js.native
    
    def throttle(instance: typingsSlinky.sugar.Function): typingsSlinky.sugar.Function = js.native
    def throttle(instance: typingsSlinky.sugar.Function, ms: Double): typingsSlinky.sugar.Function = js.native
  }
}
