package typingsSlinky.svgSprite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Svg extends js.Object {
  /**
    * If truthy, width and height attributes will be set on the sprite's <svg> element (where applicable).
    * @default true
    */
  var dimensionAttributes: js.UndefOr[Boolean] = js.native
  /**
    * Include a <DOCTYPE> declaration in each compiled sprite. If you provide a non-empty string here,
    * it will be used one-to-one as declaration (e.g. <!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1 Basic//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11-basic.dtd">).
    * If you set this to TRUE, *svg-sprite* will look at the registered shapes for a DOCTYPE declaration and use the first one it can find.
    * @default true
    */
  var doctypeDeclaration: js.UndefOr[Boolean | String] = js.native
  /**
    * In order to avoid CSS class name ambiguities, the default behavior is to namespace CSS class names in the source SVGs before compiling them into a sprite.
    * Each class name is prepended with a unique string. Disable this option to keep the class names untouched.
    * @default true
    */
  var namespaceClassnames: js.UndefOr[Boolean] = js.native
  /**
    * In order to avoid ID clashes, the default behavior is to namespace all IDs in the source SVGs before compiling them into a sprite.
    * Each ID is prepended with a unique string. In some situations, it might be desirable to disable ID namespacing, e.g. when you want to script the resulting sprite.
    * Just set svg.namespaceIDs to FALSE then and be aware that you might also want to disable SVGO's ID minification (shape.transform.svgo.plugins: [{cleanupIDs: false}]).
    * @default true
    */
  var namespaceIDs: js.UndefOr[Boolean] = js.native
  /**
    * Floating point precision for CSS positioning values (defaults to -1 meaning highest possible precision).
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Shorthand for applying custom attributes to the outermost <svg> element.
    * Please be aware that certain attributes (e.g. viewBox) will be calculated dynamically and override custom rootAttributes in any case.
    */
  var rootAttributes: js.UndefOr[js.Any] = js.native
  /**
    * Callback (or list of callbacks) that will be applied to the resulting SVG sprites as global [post-processing transformation](#svg-sprite-customization).
    * transform: Function∣Array
    */
  var transform: js.UndefOr[SvgTransformer | js.Array[SvgTransformer]] = js.native
  /**
    * Output an XML declaration at the very beginning of each compiled sprite.
    * If you provide a non-empty string here, it will be used one-to-one as declaration (e.g. <?xml version="1.0" encoding="utf-8"?>).
    * If you set this to TRUE, *svg-sprite* will look at the registered shapes for an XML declaration and use the first one it can find.
    * @default true
    */
  var xmlDeclaration: js.UndefOr[Boolean | String] = js.native
}

object Svg {
  @scala.inline
  def apply(): Svg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Svg]
  }
  @scala.inline
  implicit class SvgOps[Self <: Svg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDoctypeDeclaration(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoctypeDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doctypeDeclaration")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceClassnames(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceClassnames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceClassnames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceClassnames")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceIDs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceIDs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceIDs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceIDs")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precision")(js.undefined)
        ret
    }
    @scala.inline
    def withRootAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformFunction1(value: /* svg */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransform(value: SvgTransformer | js.Array[SvgTransformer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlDeclaration(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlDeclaration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlDeclaration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlDeclaration")(js.undefined)
        ret
    }
  }
  
}

