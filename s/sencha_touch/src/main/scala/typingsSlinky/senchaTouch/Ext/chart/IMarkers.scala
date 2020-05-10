package typingsSlinky.senchaTouch.Ext.chart

import typingsSlinky.senchaTouch.Ext.draw.sprite.IInstancing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarkers extends IInstancing {
  /** [Method] Clear the markers in the category
  		* @param category String
  		*/
  var clear: js.UndefOr[js.Function1[/* category */ js.UndefOr[String], Unit]] = js.native
  /** [Method]
  		* @param category String
  		* @param index Mixed
  		* @param isWithoutTransform Boolean
  		*/
  var getMarkerBBoxFor: js.UndefOr[
    js.Function3[
      /* category */ js.UndefOr[String], 
      /* index */ js.UndefOr[js.Any], 
      /* isWithoutTransform */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Put a marker in the category with additional attributes
  		* @param category String
  		* @param markerAttr Object
  		* @param index String|Number
  		* @param canonical Boolean
  		* @param keepRevision Boolean
  		*/
  var putMarkerFor: js.UndefOr[
    js.Function5[
      /* category */ js.UndefOr[String], 
      /* markerAttr */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[js.Any], 
      /* canonical */ js.UndefOr[Boolean], 
      /* keepRevision */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Render method
  		* @param surface Object
  		* @param ctx Object
  		* @param clipRegion Object
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  @JSName("render")
  var render_IMarkers: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[js.Any], 
      /* ctx */ js.UndefOr[js.Any], 
      /* clipRegion */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.native
}

object IMarkers {
  @scala.inline
  def apply(): IMarkers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarkers]
  }
  @scala.inline
  implicit class IMarkersOps[Self <: IMarkers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: /* category */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMarkerBBoxFor(
      value: (/* category */ js.UndefOr[String], /* index */ js.UndefOr[js.Any], /* isWithoutTransform */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkerBBoxFor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetMarkerBBoxFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMarkerBBoxFor")(js.undefined)
        ret
    }
    @scala.inline
    def withPutMarkerFor(
      value: (/* category */ js.UndefOr[String], /* markerAttr */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], /* canonical */ js.UndefOr[Boolean], /* keepRevision */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putMarkerFor")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutPutMarkerFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putMarkerFor")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* surface */ js.UndefOr[js.Any], /* ctx */ js.UndefOr[js.Any], /* clipRegion */ js.UndefOr[js.Any]) => _
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
  }
  
}

