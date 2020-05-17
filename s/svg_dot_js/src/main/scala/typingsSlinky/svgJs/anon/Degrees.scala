package typingsSlinky.svgJs.anon

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Degrees extends js.Object {
  var filterSVGElements: js.Array[HTMLElement] = js.native
  def degrees(r: Double): Double = js.native
  def filter(array: js.Array[_], block: js.Function): js.Any = js.native
  def map(array: js.Array[_], block: js.Function): js.Any = js.native
  def radians(d: Double): Double = js.native
}

object Degrees {
  @scala.inline
  def apply(
    degrees: Double => Double,
    filter: (js.Array[_], js.Function) => js.Any,
    filterSVGElements: js.Array[HTMLElement],
    map: (js.Array[_], js.Function) => js.Any,
    radians: Double => Double
  ): Degrees = {
    val __obj = js.Dynamic.literal(degrees = js.Any.fromFunction1(degrees), filter = js.Any.fromFunction2(filter), filterSVGElements = filterSVGElements.asInstanceOf[js.Any], map = js.Any.fromFunction2(map), radians = js.Any.fromFunction1(radians))
    __obj.asInstanceOf[Degrees]
  }
  @scala.inline
  implicit class DegreesOps[Self <: Degrees] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegrees(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(value: (js.Array[_], js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFilterSVGElements(value: js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSVGElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: (js.Array[_], js.Function) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRadians(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radians")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

