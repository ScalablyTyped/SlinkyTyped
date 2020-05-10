package typingsSlinky.senchaTouch.Ext.chart.series.sprite

import typingsSlinky.senchaTouch.Ext.chart.IMarkers
import typingsSlinky.senchaTouch.Ext.draw.sprite.ISector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.senchaTouch.Ext.IClass because Already inherited
- typingsSlinky.senchaTouch.Ext.IBase because Already inherited
- typingsSlinky.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait IPieSlice extends ISector {
  /** [Method]
  		* @param name String
  		* @param marker Ext.chart.Markers
  		*/
  var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var doCallout: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of rendererIndex
  		* @returns Number
  		*/
  var getRendererIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (String) */
  var label: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.native
  /** [Method] Render method
  		* @param ctx Object
  		* @param surface Object
  		* @param clipRegion Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IPieSlice: js.UndefOr[
    js.Function3[
      /* ctx */ js.UndefOr[js.Any], 
      /* surface */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var rotateLabels: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of rendererIndex
  		* @param rendererIndex Number The new value.
  		*/
  var setRendererIndex: js.UndefOr[js.Function1[/* rendererIndex */ js.UndefOr[Double], Unit]] = js.native
}

object IPieSlice {
  @scala.inline
  def apply(): IPieSlice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPieSlice]
  }
  @scala.inline
  implicit class IPieSliceOps[Self <: IPieSlice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDoCallout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doCallout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoCallout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doCallout")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRendererIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRendererIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRendererIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRendererIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
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
    def withRender(
      value: (/* ctx */ js.UndefOr[js.Any], /* surface */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
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
    def withRotateLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRendererIndex(value: /* rendererIndex */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRendererIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRendererIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRendererIndex")(js.undefined)
        ret
    }
  }
  
}

