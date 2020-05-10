package typingsSlinky.senchaTouch.Ext.chart.series.sprite

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.chart.IMarkers
import typingsSlinky.senchaTouch.Ext.draw.ISurface
import typingsSlinky.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait ICartesian extends ISprite {
  /** [Config Option] (Array) */
  var Data: js.UndefOr[Array] = js.native
  /** [Config Option] (Boolean) */
  var If: js.UndefOr[Boolean] = js.native
  /** [Method] Does a binary search of the data on the x axis using the given key
  		* @param key String
  		* @returns *
  		*/
  var binarySearch: js.UndefOr[js.Function1[/* key */ js.UndefOr[String], _]] = js.native
  /** [Method]
  		* @param name String
  		* @param marker Ext.chart.Markers
  		*/
  var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.native
  /** [Config Option] (Number) */
  var dataMaxX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var dataMaxY: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var dataMinX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var dataMinY: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var dataX: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var dataY: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  /** [Method] Returns the value of field
  		* @returns String
  		*/
  var getField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Get the nearest item index from point x y
  		* @param x Number
  		* @param y Number
  		* @returns Number The index
  		*/
  var getIndexNearPoint: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Double]] = js.native
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var labels: js.UndefOr[js.Any] = js.native
  /** [Method] Render the given visible clip range
  		* @param surface Ext.draw.Surface
  		* @param ctx Ext.draw.engine.Canvas/Ext.draw.engine.SvgContext
  		* @param clip Array
  		* @param region Arrary
  		*/
  var renderClipped: js.UndefOr[
    js.Function4[
      /* surface */ js.UndefOr[ISurface], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clip */ js.UndefOr[Array], 
      /* region */ js.UndefOr[Array], 
      Unit
    ]
  ] = js.native
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param region Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_ICartesian: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Config Option] (Number) */
  var selectionTolerance: js.UndefOr[Double] = js.native
  /** [Method] Sets the value of field
  		* @param field String The new value.
  		*/
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.native
}

object ICartesian {
  @scala.inline
  def apply(): ICartesian = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICartesian]
  }
  @scala.inline
  implicit class ICartesianOps[Self <: ICartesian] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Data")(js.undefined)
        ret
    }
    @scala.inline
    def withIf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("If")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("If")(js.undefined)
        ret
    }
    @scala.inline
    def withBinarySearch(value: /* key */ js.UndefOr[String] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binarySearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBinarySearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binarySearch")(js.undefined)
        ret
    }
    @scala.inline
    def withBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindMarker")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutBindMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMaxX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaxX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMaxX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaxX")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMaxY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaxY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMaxY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMaxY")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMinX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMinX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMinX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMinX")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMinY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMinY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMinY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMinY")(js.undefined)
        ret
    }
    @scala.inline
    def withDataX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataX")(js.undefined)
        ret
    }
    @scala.inline
    def withDataY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataY")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withGetField(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getField")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIndexNearPoint(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexNearPoint")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetIndexNearPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexNearPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelOverflowPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverflowPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelOverflowPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelOverflowPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[js.Any]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderClipped(
      value: (/* surface */ js.UndefOr[ISurface], /* ctx */ js.UndefOr[js.Any], /* clip */ js.UndefOr[Array], /* region */ js.UndefOr[Array]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderClipped")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutRenderClipped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderClipped")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withSetField(value: /* field */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setField")(js.undefined)
        ret
    }
  }
  
}

