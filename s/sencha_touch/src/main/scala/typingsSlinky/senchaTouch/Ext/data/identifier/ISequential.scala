package typingsSlinky.senchaTouch.Ext.data.identifier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISequential extends ISimple {
  /** [Method] Returns the value of seed
  		* @returns Number
  		*/
  var getSeed: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (String) */
  var prefix: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var seed: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of seed
  		* @param seed Number The new value.
  		*/
  var setSeed: js.UndefOr[js.Function1[/* seed */ js.UndefOr[Double], Unit]] = js.native
}

object ISequential {
  @scala.inline
  def apply(): ISequential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISequential]
  }
  @scala.inline
  implicit class ISequentialOps[Self <: ISequential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetSeed(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSeed")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSeed(value: /* seed */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSeed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSeed")(js.undefined)
        ret
    }
  }
  
}

