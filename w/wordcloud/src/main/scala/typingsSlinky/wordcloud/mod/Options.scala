package typingsSlinky.wordcloud.mod

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /** callback function to call when abort. */
  var abort: js.UndefOr[js.Function] = js.native
  /** If the call with in the loop takes more than x milliseconds (and blocks the browser), abort immediately. */
  var abortThreshold: js.UndefOr[Double] = js.native
  /** color of the background. */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
  		 * for DOM clouds, allows the user to define the class of the span elements.Can be a normal class
  		 * string, applying the same class to every span or a callback(word, weight, fontSize, distance, theta)
  		 * for per-span class definition. In canvas clouds or if equals null, this option has no effect.
  		 */
  var classes: js.UndefOr[
    String | (js.Function5[
      /* word */ String, 
      /* weight */ String | Double, 
      /* fontSize */ Double, 
      /* distance */ Double, 
      /* theta */ Double, 
      String
    ])
  ] = js.native
  /** paint the entire canvas with background color and consider it empty before start. */
  var clearCanvas: js.UndefOr[Boolean] = js.native
  /**
  		 * callback to call when the user clicks on a word. The callback will take arugments
  		 * callback(item, dimension,  event), where event is the original click event. This only will work on HTML5
  		 * canvas word clouds.
  		 */
  var click: js.UndefOr[EventCallback] = js.native
  /**
  		 * color of the text, can be any CSS color, or a callback(word, weight, fontSize, distance, theta)
  		 * specifies  different color for each item in the list. You may also specify colors with built-in
  		 * keywords: random-dark and random-light.
  		 */
  var color: js.UndefOr[
    String | (js.Function5[
      /* word */ String, 
      /* weight */ String | Double, 
      /* fontSize */ Double, 
      /* distance */ Double, 
      /* theta */ Double, 
      String
    ])
  ] = js.native
  /** visualize the grid by draw squares to mask the drawn areas. */
  var drawMask: js.UndefOr[Boolean] = js.native
  /** set to true to allow word being draw partly outside of the canvas. Allow word bigger than the size of the canvas to be drawn. */
  var drawOutOfBound: js.UndefOr[Boolean] = js.native
  /** degree of "flatness" of the shape wordcloud2.js should draw. */
  var ellipticity: js.UndefOr[Double] = js.native
  /** font to use. */
  var fontFamily: js.UndefOr[String] = js.native
  /** font weight to use, e.g. normal, bold or 600 */
  var fontWeight: js.UndefOr[String | Double] = js.native
  /**
  		 * size of the grid in pixels for marking the availability of the canvas — the larger the grid size,
  		 * the  bigger the gap between words.
  		 */
  var gridSize: js.UndefOr[Double] = js.native
  /**
  		 * callback to call when the cursor enters or leaves a region occupied by a word. The callback will take
  		 * arugments callback(item, dimension, event), where event is the original mousemove event. This only will work
  		 * on HTML5 canvas word clouds.
  		 */
  var hover: js.UndefOr[EventCallback] = js.native
  /**
  		 * List of words/text to paint on the canvas in a 2-d array, in the form of [word, size],
  		 * e.g. [['foo', 12] , ['bar', 6]].
  		 */
  var list: js.UndefOr[js.Array[_ | ListEntry]] = js.native
  /** color of the mask squares. */
  var maskColor: js.UndefOr[String] = js.native
  /** width of the gaps between mask squares. */
  var maskGapWidth: js.UndefOr[Double] = js.native
  /**
  		 * If the word should rotate, the maximum rotation (in rad) the text should rotate. Set the two value equal
  		 * to  keep all text in one angle.
  		 */
  var maxRotation: js.UndefOr[Double] = js.native
  /** If the word should rotate, the minimum rotation (in rad) the text should rotate. */
  var minRotation: js.UndefOr[Double] = js.native
  /** minimum font size to draw on the canvas. */
  var minSize: js.UndefOr[Double] = js.native
  /** origin of the “cloud” in [x, y]. */
  var origin: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Probability for the word to rotate. Set the number to 1 to always rotate. */
  var rotateRatio: js.UndefOr[Double] = js.native
  /**
  		 * The shape of the "cloud" to draw. Can be any polar equation represented as a callback function, or a
  		 * keyword present. Available presents are circle (default), cardioid (apple or heart shape curve, the most
  		 * known polar equation), diamond (alias of square), triangle-forward, triangle, (alias of triangle-upright,
  		 * pentagon, and star.
  		 */
  var shape: js.UndefOr[String | (js.Function1[/* theta */ Double, Double])] = js.native
  /** Shuffle the points to draw so the result will be different each time for the same list and settings. */
  var shuffle: js.UndefOr[Boolean] = js.native
  /** Wait for x milliseconds before start drawn the next item using setTimeout. */
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.native
  /** function to call or number to multiply for size of each word in the list. */
  var weightFactor: js.UndefOr[Double | (js.Function1[/* weight */ Double, Double])] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withAbortThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClassesFunction5(
      value: (/* word */ String, /* weight */ String | Double, /* fontSize */ Double, /* distance */ Double, /* theta */ Double) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withClasses(
      value: String | (js.Function5[
          /* word */ String, 
          /* weight */ String | Double, 
          /* fontSize */ Double, 
          /* distance */ Double, 
          /* theta */ Double, 
          String
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withClearCanvas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCanvas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearCanvas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearCanvas")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: (/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withColorFunction5(
      value: (/* word */ String, /* weight */ String | Double, /* fontSize */ Double, /* distance */ Double, /* theta */ Double) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withColor(
      value: String | (js.Function5[
          /* word */ String, 
          /* weight */ String | Double, 
          /* fontSize */ Double, 
          /* distance */ Double, 
          /* theta */ Double, 
          String
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawMask")(js.undefined)
        ret
    }
    @scala.inline
    def withDrawOutOfBound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawOutOfBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawOutOfBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawOutOfBound")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipticity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipticity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipticity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipticity")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGridSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: (/* item */ ListEntry, /* dimension */ Dimension, /* event */ MouseEvent) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withList(value: js.Array[_ | ListEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMaskGapWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskGapWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaskGapWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maskGapWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeFunction1(value: /* theta */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShape(value: String | (js.Function1[/* theta */ Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withShuffle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShuffle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shuffle")(js.undefined)
        ret
    }
    @scala.inline
    def withWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wait")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightFactorFunction1(value: /* weight */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightFactor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWeightFactor(value: Double | (js.Function1[/* weight */ Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightFactor")(js.undefined)
        ret
    }
  }
  
}

