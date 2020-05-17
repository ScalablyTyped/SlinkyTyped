package typingsSlinky.vexflow.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tuplet extends js.Object {
  def attach(): Unit = js.native
  def detach(): Unit = js.native
  def draw(): Unit = js.native
  def getBeatsOccupied(): Double = js.native
  def getNoteCount(): Double = js.native
  def getNotes(): js.Array[StaveNote] = js.native
  def resolveGlyphs(): Unit = js.native
  def setBeatsOccupied(beats: Double): Unit = js.native
  def setBracketed(bracketed: Boolean): Tuplet = js.native
  def setContext(context: IRenderContext): Tuplet = js.native
  def setRatioed(ratioed: Boolean): Tuplet = js.native
  def setTupletLocation(location: Double): Tuplet = js.native
}

object Tuplet {
  @scala.inline
  def apply(
    attach: () => Unit,
    detach: () => Unit,
    draw: () => Unit,
    getBeatsOccupied: () => Double,
    getNoteCount: () => Double,
    getNotes: () => js.Array[StaveNote],
    resolveGlyphs: () => Unit,
    setBeatsOccupied: Double => Unit,
    setBracketed: Boolean => Tuplet,
    setContext: IRenderContext => Tuplet,
    setRatioed: Boolean => Tuplet,
    setTupletLocation: Double => Tuplet
  ): Tuplet = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), detach = js.Any.fromFunction0(detach), draw = js.Any.fromFunction0(draw), getBeatsOccupied = js.Any.fromFunction0(getBeatsOccupied), getNoteCount = js.Any.fromFunction0(getNoteCount), getNotes = js.Any.fromFunction0(getNotes), resolveGlyphs = js.Any.fromFunction0(resolveGlyphs), setBeatsOccupied = js.Any.fromFunction1(setBeatsOccupied), setBracketed = js.Any.fromFunction1(setBracketed), setContext = js.Any.fromFunction1(setContext), setRatioed = js.Any.fromFunction1(setRatioed), setTupletLocation = js.Any.fromFunction1(setTupletLocation))
    __obj.asInstanceOf[Tuplet]
  }
  @scala.inline
  implicit class TupletOps[Self <: Tuplet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDetach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBeatsOccupied(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBeatsOccupied")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNoteCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNoteCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNotes(value: () => js.Array[StaveNote]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNotes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResolveGlyphs(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveGlyphs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetBeatsOccupied(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBeatsOccupied")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBracketed(value: Boolean => Tuplet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBracketed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetContext(value: IRenderContext => Tuplet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRatioed(value: Boolean => Tuplet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRatioed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTupletLocation(value: Double => Tuplet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTupletLocation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

