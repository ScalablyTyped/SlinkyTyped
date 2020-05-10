package typingsSlinky.wavesurferJs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.wavesurferJs.AnonXhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaveSurferUtil extends js.Object {
  var Observer: typingsSlinky.wavesurferJs.mod.Observer = js.native
  def ajax(options: AnonXhr): Observer = js.native
  def extend(dest: js.Object, sources: js.Object*): js.Object = js.native
  def frame(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function1[/* repeated */ js.Any, Double] = js.native
  def getId(): String = js.native
  def max(values: js.Array[Double]): Double = js.native
  def min(values: js.Array[Double]): Double = js.native
  def preventClick(): Unit = js.native
  def requestAnimationFrame(): js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double] = js.native
  def style(el: HTMLElement, styles: StringDictionary[String]): HTMLElement = js.native
}

object WaveSurferUtil {
  @scala.inline
  def apply(
    Observer: Observer,
    ajax: AnonXhr => Observer,
    extend: (js.Object, /* repeated */ js.Object) => js.Object,
    frame: js.Function1[/* repeated */ js.Any, Unit] => js.Function1[/* repeated */ js.Any, Double],
    getId: () => String,
    max: js.Array[Double] => Double,
    min: js.Array[Double] => Double,
    preventClick: () => Unit,
    requestAnimationFrame: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double],
    style: (HTMLElement, StringDictionary[String]) => HTMLElement
  ): WaveSurferUtil = {
    val __obj = js.Dynamic.literal(Observer = Observer.asInstanceOf[js.Any], ajax = js.Any.fromFunction1(ajax), extend = js.Any.fromFunction2(extend), frame = js.Any.fromFunction1(frame), getId = js.Any.fromFunction0(getId), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), preventClick = js.Any.fromFunction0(preventClick), requestAnimationFrame = js.Any.fromFunction0(requestAnimationFrame), style = js.Any.fromFunction2(style))
    __obj.asInstanceOf[WaveSurferUtil]
  }
  @scala.inline
  implicit class WaveSurferUtilOps[Self <: WaveSurferUtil] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObserver(value: Observer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Observer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAjax(value: AnonXhr => Observer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtend(value: (js.Object, /* repeated */ js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFrame(value: js.Function1[/* repeated */ js.Any, Unit] => js.Function1[/* repeated */ js.Any, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMax(value: js.Array[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMin(value: js.Array[Double] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPreventClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestAnimationFrame(value: () => js.Function1[/* fn */ js.Function1[/* t */ Double, Unit], Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStyle(value: (HTMLElement, StringDictionary[String]) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

