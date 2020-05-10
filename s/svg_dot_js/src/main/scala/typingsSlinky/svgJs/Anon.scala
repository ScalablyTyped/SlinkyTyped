package typingsSlinky.svgJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon extends js.Object {
  @JSName(">")
  def Greaterthansign(pos: Double): Double = js.native
  @JSName("<")
  def Lessthansign(pos: Double): Double = js.native
  @JSName("<>")
  def LessthansignGreaterthansign(pos: Double): Double = js.native
  @JSName("-")
  def _dash(pos: Double): Double = js.native
}

object Anon {
  @scala.inline
  def apply(
    Greaterthansign: Double => Double,
    Lessthansign: Double => Double,
    LessthansignGreaterthansign: Double => Double,
    _dash: Double => Double
  ): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(">")(js.Any.fromFunction1(Greaterthansign))
    __obj.updateDynamic("<")(js.Any.fromFunction1(Lessthansign))
    __obj.updateDynamic("<>")(js.Any.fromFunction1(LessthansignGreaterthansign))
    __obj.updateDynamic("-")(js.Any.fromFunction1(_dash))
    __obj.asInstanceOf[Anon]
  }
  @scala.inline
  implicit class AnonOps[Self <: Anon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGreaterthansign(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic(">")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLessthansign(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLessthansignGreaterthansign(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("<>")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_dash(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("-")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

