package typingsSlinky.senchaTouch.Ext.fx.animation

import typingsSlinky.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IEvented {
  /** [Config Option] (Object) */
  var before: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var easing: js.UndefOr[String] = js.native
  /** [Method] Returns the value of after
  		* @returns Object
  		*/
  var getAfter: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of before
  		* @returns Object
  		*/
  var getBefore: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of delay
  		* @returns Number
  		*/
  var getDelay: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of duration
  		* @returns Number
  		*/
  var getDuration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of easing
  		* @returns String
  		*/
  var getEasing: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of element
  		* @returns Object
  		*/
  var getElement: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of iteration
  		* @returns Number
  		*/
  var getIteration: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the value of name
  		* @returns String
  		*/
  var getName: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of onBeforeEnd
  		* @returns Object
  		*/
  var getOnBeforeEnd: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of onBeforeStart
  		* @returns Object
  		*/
  var getOnBeforeStart: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of onEnd
  		* @returns Object
  		*/
  var getOnEnd: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of preserveEndState
  		* @returns Boolean
  		*/
  var getPreserveEndState: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of replacePrevious
  		* @returns Boolean
  		*/
  var getReplacePrevious: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of reverse
  		* @returns Object
  		*/
  var getReverse: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of after
  		* @param after Object The new value.
  		*/
  var setAfter: js.UndefOr[js.Function1[/* after */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of before
  		* @param before Object The new value.
  		*/
  var setBefore: js.UndefOr[js.Function1[/* before */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of delay
  		* @param delay Number The new value.
  		*/
  var setDelay: js.UndefOr[js.Function1[/* delay */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of duration
  		* @param duration Number The new value.
  		*/
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of easing
  		* @param easing String The new value.
  		*/
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of element
  		* @param element Object The new value.
  		*/
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of iteration
  		* @param iteration Number The new value.
  		*/
  var setIteration: js.UndefOr[js.Function1[/* iteration */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of name
  		* @param name String The new value.
  		*/
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of onBeforeEnd
  		* @param onBeforeEnd Object The new value.
  		*/
  var setOnBeforeEnd: js.UndefOr[js.Function1[/* onBeforeEnd */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of onBeforeStart
  		* @param onBeforeStart Object The new value.
  		*/
  var setOnBeforeStart: js.UndefOr[js.Function1[/* onBeforeStart */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of onEnd
  		* @param onEnd Object The new value.
  		*/
  var setOnEnd: js.UndefOr[js.Function1[/* onEnd */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of preserveEndState
  		* @param preserveEndState Boolean The new value.
  		*/
  var setPreserveEndState: js.UndefOr[js.Function1[/* preserveEndState */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of replacePrevious
  		* @param replacePrevious Boolean The new value.
  		*/
  var setReplacePrevious: js.UndefOr[js.Function1[/* replacePrevious */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of reverse
  		* @param reverse Object The new value.
  		*/
  var setReverse: js.UndefOr[js.Function1[/* reverse */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBefore(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAfter(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAfter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBefore(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBefore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDelay(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDelay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDirection(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDuration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEasing(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withGetElement(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIteration(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIteration")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOnBeforeEnd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnBeforeEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOnBeforeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnBeforeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOnBeforeStart(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnBeforeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOnBeforeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnBeforeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOnEnd(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOnEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPreserveEndState(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreserveEndState")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetPreserveEndState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreserveEndState")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReplacePrevious(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReplacePrevious")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReplacePrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReplacePrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReverse(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReverse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withGetScope(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAfter(value: /* after */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAfter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBefore(value: /* before */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBefore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDelay(value: /* delay */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDelay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDirection(value: /* direction */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEasing(value: /* easing */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasing")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setElement")(js.undefined)
        ret
    }
    @scala.inline
    def withSetIteration(value: /* iteration */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIteration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetIteration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIteration")(js.undefined)
        ret
    }
    @scala.inline
    def withSetName(value: /* name */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOnBeforeEnd(value: /* onBeforeEnd */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnBeforeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOnBeforeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnBeforeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOnBeforeStart(value: /* onBeforeStart */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnBeforeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOnBeforeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnBeforeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOnEnd(value: /* onEnd */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetOnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withSetPreserveEndState(value: /* preserveEndState */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreserveEndState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetPreserveEndState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPreserveEndState")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReplacePrevious(value: /* replacePrevious */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReplacePrevious")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReplacePrevious: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReplacePrevious")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReverse(value: /* reverse */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReverse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReverse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReverse")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScope")(js.undefined)
        ret
    }
  }
  
}

