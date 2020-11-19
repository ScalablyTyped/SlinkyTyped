package typingsSlinky.vueRx.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.rxjs.mod.Observable_
import typingsSlinky.vue.optionsMod.WatchOptions
import typingsSlinky.vueRx.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  
  @js.native
  trait Vue extends js.Object {
    
    @JSName("$createObservableMethod")
    def $createObservableMethod(methodName: String): Observable_[_] = js.native
    
    @JSName("$eventToObservable")
    def $eventToObservable(event: String): Observable_[Msg] = js.native
    
    @JSName("$fromDOMEvent")
    def $fromDOMEvent(selector: String, event: String): Observable_[Event] = js.native
    @JSName("$fromDOMEvent")
    def $fromDOMEvent(selector: Null, event: String): Observable_[Event] = js.native
    
    @JSName("$observables")
    var $observables: Observables = js.native
    
    @JSName("$subscribeTo")
    def $subscribeTo[T](observable: Observable_[T], next: js.Function1[/* t */ T, Unit]): Unit = js.native
    @JSName("$subscribeTo")
    def $subscribeTo[T](
      observable: Observable_[T],
      next: js.Function1[/* t */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ): Unit = js.native
    @JSName("$subscribeTo")
    def $subscribeTo[T](
      observable: Observable_[T],
      next: js.Function1[/* t */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit]
    ): Unit = js.native
    @JSName("$subscribeTo")
    def $subscribeTo[T](
      observable: Observable_[T],
      next: js.Function1[/* t */ T, Unit],
      error: js.Function1[/* e */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): Unit = js.native
    
    @JSName("$watchAsObservable")
    def $watchAsObservable(expr: String): Observable_[WatchObservable[_]] = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable(expr: String, options: WatchOptions): Observable_[WatchObservable[_]] = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T]): Observable_[WatchObservable[T]] = js.native
    @JSName("$watchAsObservable")
    def $watchAsObservable[T](fn: js.ThisFunction0[/* this */ this.type, T], options: WatchOptions): Observable_[WatchObservable[T]] = js.native
  }
}
