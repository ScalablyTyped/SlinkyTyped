package typingsSlinky.senchaTouch.Ext.draw.sprite

import typingsSlinky.senchaTouch.Ext.Array
import typingsSlinky.senchaTouch.Ext.draw.ISurface
import typingsSlinky.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISprite extends IObservable {
  /** [Config Option] (Number) */
  var A: js.UndefOr[Double] = js.native
  /** [Config Option] (Array) */
  var An: js.UndefOr[Array] = js.native
  /** [Property] (Object) */
  var attr: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var fillOpacity: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var fillStyle: js.UndefOr[String] = js.native
  /** [Method] Returns the bounding box for the given Sprite as calculated with the Canvas engine
  		* @param isWithoutTransform Boolean Whether to calculate the bounding box with the current transforms or not.
  		*/
  var getBBox: js.UndefOr[js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Subclass can rewrite this function to gain better performance
  		* @param isWithoutTransform Boolean
  		* @returns Array
  		*/
  var getBBoxCenter: js.UndefOr[js.Function1[/* isWithoutTransform */ js.UndefOr[Boolean], Array]] = js.native
  /** [Method] Returns the value of parent
  		* @returns Object
  		*/
  var getParent: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Number) */
  var globalAlpha: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  /** [Method] Hide the sprite
  		* @returns Ext.draw.sprite.Sprite this
  		*/
  var hide: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (String) */
  var lineCap: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var lineJoin: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var lineWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var miterLimit: js.UndefOr[Double] = js.native
  /** [Method] Called before rendering  */
  var preRender: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_ISprite: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.native
  /** [Method] Render method
  		* @param surface Ext.draw.Surface The surface.
  		* @param ctx Object A context object compatible with CanvasRenderingContext2D.
  		* @param region Array The clip region (or called dirty rect) of the current rendering. Not be confused with surface.getRegion().
  		* @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
  		*/
  var render: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[ISurface], 
      /* ctx */ js.UndefOr[js.Any], 
      /* region */ js.UndefOr[Array], 
      _
    ]
  ] = js.native
  /** [Config Option] (Number) */
  var rotationCenterX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var rotationCenterY: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var rotationRads: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var scalingCenterX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var scalingCenterY: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var scalingX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var scalingY: js.UndefOr[Double] = js.native
  /** [Method] Set attributes of the sprite
  		* @param changes Object The content of the change.
  		* @param bypassNormalization Boolean true to avoid normalization of the given changes.
  		* @param avoidCopy Boolean true to avoid copying the changes object. The content of object may be destroyed.
  		*/
  var setAttributes: js.UndefOr[
    js.Function3[
      /* changes */ js.UndefOr[js.Any], 
      /* bypassNormalization */ js.UndefOr[Boolean], 
      /* avoidCopy */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /** [Method] Set attributes of the sprite assuming the names and values have already been normalized
  		* @param changes Object The content of the change.
  		* @param avoidCopy Boolean true to avoid copying the changes object. The content of object may be destroyed.
  		*/
  var setAttributesBypassingNormalization: js.UndefOr[
    js.Function2[/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Sets the value of parent
  		* @param parent Object The new value.
  		*/
  var setParent: js.UndefOr[js.Function1[/* parent */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Number) */
  var shadowBlur: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var shadowColor: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  /** [Method] Show the sprite
  		* @returns Ext.draw.sprite.Sprite this
  		*/
  var show: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Number) */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var strokeStyle: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var transformFillStroke: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var translationX: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var translationY: js.UndefOr[Double] = js.native
  /** [Method] Subclass will fill the plain object with x y width height information of the plain bounding box of this sprite
  		* @param plain Object Target object.
  		*/
  var updatePlainBBox: js.UndefOr[js.Function1[/* plain */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Subclass will fill the plain object with x y width height information of the transformed bounding box of this sprite
  		* @param transform Object Target object.
  		* @param plain Object Auxiliary object providing information of plain object.
  		*/
  var updateTransformedBBox: js.UndefOr[
    js.Function2[/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Applies sprite s attributes to the given context
  		* @param ctx Object Context to apply sprite's attributes to.
  		* @param region Array The region of the context to be affected by gradients.
  		*/
  var useAttributes: js.UndefOr[js.Function2[/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array], Unit]] = js.native
  /** [Config Option] (Number) */
  var zIndex: js.UndefOr[Double] = js.native
}

object ISprite {
  @scala.inline
  def apply(): ISprite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISprite]
  }
  @scala.inline
  implicit class ISpriteOps[Self <: ISprite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("A")(js.undefined)
        ret
    }
    @scala.inline
    def withAn(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("An")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("An")(js.undefined)
        ret
    }
    @scala.inline
    def withAttr(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withFillStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBBox(value: /* isWithoutTransform */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBox")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBBoxCenter(value: /* isWithoutTransform */ js.UndefOr[Boolean] => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBoxCenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetBBoxCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBBoxCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParent(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParent")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalAlpha")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: () => ISprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withLineCap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineCap")(js.undefined)
        ret
    }
    @scala.inline
    def withLineJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineJoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMiterLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPreRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRender")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPreRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preRender")(js.undefined)
        ret
    }
    @scala.inline
    def withRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRelayEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relayEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: (/* surface */ js.UndefOr[ISurface], /* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array]) => _
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
    def withRotationCenterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationCenterX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationCenterX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationCenterX")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationCenterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationCenterY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationCenterY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationCenterY")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationRads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationRads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationRads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationRads")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingCenterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingCenterX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingCenterX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingCenterX")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingCenterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingCenterY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingCenterY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingCenterY")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingX")(js.undefined)
        ret
    }
    @scala.inline
    def withScalingY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScalingY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scalingY")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributes(
      value: (/* changes */ js.UndefOr[js.Any], /* bypassNormalization */ js.UndefOr[Boolean], /* avoidCopy */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributes")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSetAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withSetAttributesBypassingNormalization(value: (/* changes */ js.UndefOr[js.Any], /* avoidCopy */ js.UndefOr[Boolean]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributesBypassingNormalization")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetAttributesBypassingNormalization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAttributesBypassingNormalization")(js.undefined)
        ret
    }
    @scala.inline
    def withSetParent(value: /* parent */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParent")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffsetY")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: () => ISprite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformFillStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFillStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformFillStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformFillStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslationX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationX")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslationY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationY")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatePlainBBox(value: /* plain */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePlainBBox")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdatePlainBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePlainBBox")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTransformedBBox(value: (/* transform */ js.UndefOr[js.Any], /* plain */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTransformedBBox")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUpdateTransformedBBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTransformedBBox")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAttributes(value: (/* ctx */ js.UndefOr[js.Any], /* region */ js.UndefOr[Array]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAttributes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUseAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

