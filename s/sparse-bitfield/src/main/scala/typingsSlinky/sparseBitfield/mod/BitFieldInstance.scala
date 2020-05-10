package typingsSlinky.sparseBitfield.mod

import typingsSlinky.memoryPager.mod.PagerInstance
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BitFieldInstance extends js.Object {
  /**
    * A `memory-pager` instance that is managing the underlying memory.
    * If you set `trackUpdates` to `true` in the constructor you can use `.lastUpdate()` on this instance
    * to get the last updated memory page.
    */
  val pages: PagerInstance = js.native
  /**
    * Get the value of a bit.
    */
  def get(index: Double): Boolean = js.native
  /**
    * Get the value of a byte.
    */
  def getByte(index: Double): Double = js.native
  /**
    * Set a bit to true or false.
    */
  def set(index: Double, value: Boolean): Boolean = js.native
  /**
    * Set a byte to a new value.
    */
  def setByte(index: Double, byte: Double): Boolean = js.native
  /**
    * Get a single buffer representing the entire bitfield.
    */
  def toBuffer(): Buffer = js.native
}

object BitFieldInstance {
  @scala.inline
  def apply(
    get: Double => Boolean,
    getByte: Double => Double,
    pages: PagerInstance,
    set: (Double, Boolean) => Boolean,
    setByte: (Double, Double) => Boolean,
    toBuffer: () => Buffer
  ): BitFieldInstance = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getByte = js.Any.fromFunction1(getByte), pages = pages.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setByte = js.Any.fromFunction2(setByte), toBuffer = js.Any.fromFunction0(toBuffer))
    __obj.asInstanceOf[BitFieldInstance]
  }
  @scala.inline
  implicit class BitFieldInstanceOps[Self <: BitFieldInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetByte(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getByte")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPages(value: PagerInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: (Double, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetByte(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setByte")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToBuffer(value: () => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBuffer")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

