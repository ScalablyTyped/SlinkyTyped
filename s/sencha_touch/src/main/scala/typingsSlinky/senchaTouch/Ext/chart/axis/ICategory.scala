package typingsSlinky.senchaTouch.Ext.chart.axis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICategory extends IAxis {
  /** [Method] Returns the value of layout
  		* @returns String
  		*/
  @JSName("getLayout")
  var getLayout_ICategory: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of segmenter
  		* @returns String
  		*/
  @JSName("getSegmenter")
  var getSegmenter_ICategory: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of layout
  		* @param layout String The new value.
  		*/
  @JSName("setLayout")
  var setLayout_ICategory: js.UndefOr[js.Function1[/* layout */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of segmenter
  		* @param segmenter String The new value.
  		*/
  @JSName("setSegmenter")
  var setSegmenter_ICategory: js.UndefOr[js.Function1[/* segmenter */ js.UndefOr[String], Unit]] = js.native
}

object ICategory {
  @scala.inline
  def apply(): ICategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICategory]
  }
  @scala.inline
  implicit class ICategoryOps[Self <: ICategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLayout(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSegmenter(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSegmenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSegmenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSegmenter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLayout(value: /* layout */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSegmenter(value: /* segmenter */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSegmenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetSegmenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSegmenter")(js.undefined)
        ret
    }
  }
  
}

