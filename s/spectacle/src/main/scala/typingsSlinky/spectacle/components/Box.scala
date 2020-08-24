package typingsSlinky.spectacle.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.spectacle.mod.BoxProps
import typingsSlinky.spectacle.spectacleStrings.borderWidths
import typingsSlinky.spectacle.spectacleStrings.colors
import typingsSlinky.spectacle.spectacleStrings.radii
import typingsSlinky.spectacle.spectacleStrings.space
import typingsSlinky.styledSystem.mod.RequiredTheme
import typingsSlinky.styledSystem.mod.ResponsiveValue
import typingsSlinky.styledSystem.mod.ThemeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Box {
  @JSImport("spectacle", "Box")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def backgroundColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("backgroundColor", js.Array(value :_*))
    @scala.inline
    def backgroundColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundColorNull: this.type = set("backgroundColor", null)
    @scala.inline
    def bgVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("bg", js.Array(value :_*))
    @scala.inline
    def bg(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def bgNull: this.type = set("bg", null)
    @scala.inline
    def borderVarargs(value: (js.Any | Null)*): this.type = set("border", js.Array(value :_*))
    @scala.inline
    def border(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def borderNull: this.type = set("border", null)
    @scala.inline
    def borderBottomVarargs(value: (js.Any | Null)*): this.type = set("borderBottom", js.Array(value :_*))
    @scala.inline
    def borderBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderBottomProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def borderBottomNull: this.type = set("borderBottom", null)
    @scala.inline
    def borderBottomColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("borderBottomColor", js.Array(value :_*))
    @scala.inline
    def borderBottomColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderBottomColorNull: this.type = set("borderBottomColor", null)
    @scala.inline
    def borderBottomLeftRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): this.type = set("borderBottomLeftRadius", js.Array(value :_*))
    @scala.inline
    def borderBottomLeftRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): this.type = set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderBottomLeftRadiusNull: this.type = set("borderBottomLeftRadius", null)
    @scala.inline
    def borderBottomRightRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): this.type = set("borderBottomRightRadius", js.Array(value :_*))
    @scala.inline
    def borderBottomRightRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): this.type = set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderBottomRightRadiusNull: this.type = set("borderBottomRightRadius", null)
    @scala.inline
    def borderBottomStyleVarargs(value: (js.Any | Null)*): this.type = set("borderBottomStyle", js.Array(value :_*))
    @scala.inline
    def borderBottomStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderBottomStyleProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderBottomStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def borderBottomStyleNull: this.type = set("borderBottomStyle", null)
    @scala.inline
    def borderBottomWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): this.type = set("borderBottomWidth", js.Array(value :_*))
    @scala.inline
    def borderBottomWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): this.type = set("borderBottomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def borderBottomWidthNull: this.type = set("borderBottomWidth", null)
    @scala.inline
    def borderColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("borderColor", js.Array(value :_*))
    @scala.inline
    def borderColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderColorNull: this.type = set("borderColor", null)
    @scala.inline
    def borderLeftVarargs(value: (js.Any | Null)*): this.type = set("borderLeft", js.Array(value :_*))
    @scala.inline
    def borderLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderLeftProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def borderLeftNull: this.type = set("borderLeft", null)
    @scala.inline
    def borderLeftColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("borderLeftColor", js.Array(value :_*))
    @scala.inline
    def borderLeftColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("borderLeftColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderLeftColorNull: this.type = set("borderLeftColor", null)
    @scala.inline
    def borderLeftStyleVarargs(value: (js.Any | Null)*): this.type = set("borderLeftStyle", js.Array(value :_*))
    @scala.inline
    def borderLeftStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderLeftStyleProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderLeftStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def borderLeftStyleNull: this.type = set("borderLeftStyle", null)
    @scala.inline
    def borderLeftWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): this.type = set("borderLeftWidth", js.Array(value :_*))
    @scala.inline
    def borderLeftWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): this.type = set("borderLeftWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def borderLeftWidthNull: this.type = set("borderLeftWidth", null)
    @scala.inline
    def borderRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): this.type = set("borderRadius", js.Array(value :_*))
    @scala.inline
    def borderRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): this.type = set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderRadiusNull: this.type = set("borderRadius", null)
    @scala.inline
    def borderRightVarargs(value: (js.Any | Null)*): this.type = set("borderRight", js.Array(value :_*))
    @scala.inline
    def borderRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderRight", value.asInstanceOf[js.Any])
    @scala.inline
    def borderRightNull: this.type = set("borderRight", null)
    @scala.inline
    def borderRightColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("borderRightColor", js.Array(value :_*))
    @scala.inline
    def borderRightColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("borderRightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderRightColorNull: this.type = set("borderRightColor", null)
    @scala.inline
    def borderRightStyleVarargs(value: (js.Any | Null)*): this.type = set("borderRightStyle", js.Array(value :_*))
    @scala.inline
    def borderRightStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRightStyleProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderRightStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def borderRightStyleNull: this.type = set("borderRightStyle", null)
    @scala.inline
    def borderRightWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): this.type = set("borderRightWidth", js.Array(value :_*))
    @scala.inline
    def borderRightWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): this.type = set("borderRightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def borderRightWidthNull: this.type = set("borderRightWidth", null)
    @scala.inline
    def borderStyleVarargs(value: (js.Any | Null)*): this.type = set("borderStyle", js.Array(value :_*))
    @scala.inline
    def borderStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderStyleProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def borderStyleNull: this.type = set("borderStyle", null)
    @scala.inline
    def borderTopVarargs(value: (js.Any | Null)*): this.type = set("borderTop", js.Array(value :_*))
    @scala.inline
    def borderTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderTopProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderTop", value.asInstanceOf[js.Any])
    @scala.inline
    def borderTopNull: this.type = set("borderTop", null)
    @scala.inline
    def borderTopColorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("borderTopColor", js.Array(value :_*))
    @scala.inline
    def borderTopColor(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("borderTopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def borderTopColorNull: this.type = set("borderTopColor", null)
    @scala.inline
    def borderTopLeftRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): this.type = set("borderTopLeftRadius", js.Array(value :_*))
    @scala.inline
    def borderTopLeftRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): this.type = set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderTopLeftRadiusNull: this.type = set("borderTopLeftRadius", null)
    @scala.inline
    def borderTopRightRadiusVarargs(value: ((ThemeValue[radii, RequiredTheme, js.Any]) | Null)*): this.type = set("borderTopRightRadius", js.Array(value :_*))
    @scala.inline
    def borderTopRightRadius(value: ResponsiveValue[ThemeValue[radii, RequiredTheme, _], RequiredTheme]): this.type = set("borderTopRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def borderTopRightRadiusNull: this.type = set("borderTopRightRadius", null)
    @scala.inline
    def borderTopStyleVarargs(value: (js.Any | Null)*): this.type = set("borderTopStyle", js.Array(value :_*))
    @scala.inline
    def borderTopStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderTopStyleProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderTopStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def borderTopStyleNull: this.type = set("borderTopStyle", null)
    @scala.inline
    def borderTopWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): this.type = set("borderTopWidth", js.Array(value :_*))
    @scala.inline
    def borderTopWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): this.type = set("borderTopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def borderTopWidthNull: this.type = set("borderTopWidth", null)
    @scala.inline
    def borderWidthVarargs(value: ((ThemeValue[borderWidths, RequiredTheme, js.Any]) | Null)*): this.type = set("borderWidth", js.Array(value :_*))
    @scala.inline
    def borderWidth(value: ResponsiveValue[ThemeValue[borderWidths, RequiredTheme, _], RequiredTheme]): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def borderWidthNull: this.type = set("borderWidth", null)
    @scala.inline
    def borderXVarargs(value: (js.Any | Null)*): this.type = set("borderX", js.Array(value :_*))
    @scala.inline
    def borderX(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderX", value.asInstanceOf[js.Any])
    @scala.inline
    def borderXNull: this.type = set("borderX", null)
    @scala.inline
    def borderYVarargs(value: (js.Any | Null)*): this.type = set("borderY", js.Array(value :_*))
    @scala.inline
    def borderY(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("borderY", value.asInstanceOf[js.Any])
    @scala.inline
    def borderYNull: this.type = set("borderY", null)
    @scala.inline
    def bottomVarargs(value: (js.Any | Null)*): this.type = set("bottom", js.Array(value :_*))
    @scala.inline
    def bottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BottomProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def bottomNull: this.type = set("bottom", null)
    @scala.inline
    def colorVarargs(value: ((ThemeValue[colors, RequiredTheme, js.Any]) | Null)*): this.type = set("color", js.Array(value :_*))
    @scala.inline
    def color(value: ResponsiveValue[ThemeValue[colors, RequiredTheme, _], RequiredTheme]): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def colorNull: this.type = set("color", null)
    @scala.inline
    def displayVarargs(value: (js.Any | Null)*): this.type = set("display", js.Array(value :_*))
    @scala.inline
    def display(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.DisplayProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def displayNull: this.type = set("display", null)
    @scala.inline
    def heightVarargs(value: (js.Any | Null)*): this.type = set("height", js.Array(value :_*))
    @scala.inline
    def height(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def heightNull: this.type = set("height", null)
    @scala.inline
    def leftVarargs(value: (js.Any | Null)*): this.type = set("left", js.Array(value :_*))
    @scala.inline
    def left(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LeftProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def leftNull: this.type = set("left", null)
    @scala.inline
    def mVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("m", js.Array(value :_*))
    @scala.inline
    def m(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def mNull: this.type = set("m", null)
    @scala.inline
    def marginVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("margin", js.Array(value :_*))
    @scala.inline
    def margin(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def marginNull: this.type = set("margin", null)
    @scala.inline
    def marginBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginBottom", js.Array(value :_*))
    @scala.inline
    def marginBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def marginBottomNull: this.type = set("marginBottom", null)
    @scala.inline
    def marginLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginLeft", js.Array(value :_*))
    @scala.inline
    def marginLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def marginLeftNull: this.type = set("marginLeft", null)
    @scala.inline
    def marginRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginRight", js.Array(value :_*))
    @scala.inline
    def marginRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def marginRightNull: this.type = set("marginRight", null)
    @scala.inline
    def marginTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginTop", js.Array(value :_*))
    @scala.inline
    def marginTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def marginTopNull: this.type = set("marginTop", null)
    @scala.inline
    def marginXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginX", js.Array(value :_*))
    @scala.inline
    def marginX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginX", value.asInstanceOf[js.Any])
    @scala.inline
    def marginXNull: this.type = set("marginX", null)
    @scala.inline
    def marginYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("marginY", js.Array(value :_*))
    @scala.inline
    def marginY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("marginY", value.asInstanceOf[js.Any])
    @scala.inline
    def marginYNull: this.type = set("marginY", null)
    @scala.inline
    def maxHeightVarargs(value: (js.Any | Null)*): this.type = set("maxHeight", js.Array(value :_*))
    @scala.inline
    def maxHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxHeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def maxHeightNull: this.type = set("maxHeight", null)
    @scala.inline
    def maxWidthVarargs(value: (js.Any | Null)*): this.type = set("maxWidth", js.Array(value :_*))
    @scala.inline
    def maxWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxWidthProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def maxWidthNull: this.type = set("maxWidth", null)
    @scala.inline
    def mbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mb", js.Array(value :_*))
    @scala.inline
    def mb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("mb", value.asInstanceOf[js.Any])
    @scala.inline
    def mbNull: this.type = set("mb", null)
    @scala.inline
    def minHeightVarargs(value: (js.Any | Null)*): this.type = set("minHeight", js.Array(value :_*))
    @scala.inline
    def minHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinHeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeightNull: this.type = set("minHeight", null)
    @scala.inline
    def minWidthVarargs(value: (js.Any | Null)*): this.type = set("minWidth", js.Array(value :_*))
    @scala.inline
    def minWidth(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinWidthProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def minWidthNull: this.type = set("minWidth", null)
    @scala.inline
    def mlVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("ml", js.Array(value :_*))
    @scala.inline
    def ml(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("ml", value.asInstanceOf[js.Any])
    @scala.inline
    def mlNull: this.type = set("ml", null)
    @scala.inline
    def mrVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mr", js.Array(value :_*))
    @scala.inline
    def mr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("mr", value.asInstanceOf[js.Any])
    @scala.inline
    def mrNull: this.type = set("mr", null)
    @scala.inline
    def mtVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mt", js.Array(value :_*))
    @scala.inline
    def mt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("mt", value.asInstanceOf[js.Any])
    @scala.inline
    def mtNull: this.type = set("mt", null)
    @scala.inline
    def mxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("mx", js.Array(value :_*))
    @scala.inline
    def mx(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("mx", value.asInstanceOf[js.Any])
    @scala.inline
    def mxNull: this.type = set("mx", null)
    @scala.inline
    def myVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("my", js.Array(value :_*))
    @scala.inline
    def my(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("my", value.asInstanceOf[js.Any])
    @scala.inline
    def myNull: this.type = set("my", null)
    @scala.inline
    def opacityVarargs(value: (js.Any | Null)*): this.type = set("opacity", js.Array(value :_*))
    @scala.inline
    def opacity(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GlobalsNumber */ _, 
          RequiredTheme
        ]
    ): this.type = set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def opacityNull: this.type = set("opacity", null)
    @scala.inline
    def overflowVarargs(value: (js.Any | Null)*): this.type = set("overflow", js.Array(value :_*))
    @scala.inline
    def overflow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowNull: this.type = set("overflow", null)
    @scala.inline
    def overflowXVarargs(value: (js.Any | Null)*): this.type = set("overflowX", js.Array(value :_*))
    @scala.inline
    def overflowX(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowXProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("overflowX", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowXNull: this.type = set("overflowX", null)
    @scala.inline
    def overflowYVarargs(value: (js.Any | Null)*): this.type = set("overflowY", js.Array(value :_*))
    @scala.inline
    def overflowY(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.OverflowYProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("overflowY", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowYNull: this.type = set("overflowY", null)
    @scala.inline
    def pVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("p", js.Array(value :_*))
    @scala.inline
    def p(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def pNull: this.type = set("p", null)
    @scala.inline
    def paddingVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("padding", js.Array(value :_*))
    @scala.inline
    def padding(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingNull: this.type = set("padding", null)
    @scala.inline
    def paddingBottomVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingBottom", js.Array(value :_*))
    @scala.inline
    def paddingBottom(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingBottomNull: this.type = set("paddingBottom", null)
    @scala.inline
    def paddingLeftVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingLeft", js.Array(value :_*))
    @scala.inline
    def paddingLeft(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingLeftNull: this.type = set("paddingLeft", null)
    @scala.inline
    def paddingRightVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingRight", js.Array(value :_*))
    @scala.inline
    def paddingRight(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingRightNull: this.type = set("paddingRight", null)
    @scala.inline
    def paddingTopVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingTop", js.Array(value :_*))
    @scala.inline
    def paddingTop(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingTopNull: this.type = set("paddingTop", null)
    @scala.inline
    def paddingXVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingX", js.Array(value :_*))
    @scala.inline
    def paddingX(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingX", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingXNull: this.type = set("paddingX", null)
    @scala.inline
    def paddingYVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("paddingY", js.Array(value :_*))
    @scala.inline
    def paddingY(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("paddingY", value.asInstanceOf[js.Any])
    @scala.inline
    def paddingYNull: this.type = set("paddingY", null)
    @scala.inline
    def pbVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pb", js.Array(value :_*))
    @scala.inline
    def pb(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("pb", value.asInstanceOf[js.Any])
    @scala.inline
    def pbNull: this.type = set("pb", null)
    @scala.inline
    def plVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pl", js.Array(value :_*))
    @scala.inline
    def pl(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("pl", value.asInstanceOf[js.Any])
    @scala.inline
    def plNull: this.type = set("pl", null)
    @scala.inline
    def positionVarargs(value: (js.Any | Null)*): this.type = set("position", js.Array(value :_*))
    @scala.inline
    def position(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PositionProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def positionNull: this.type = set("position", null)
    @scala.inline
    def prVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pr", js.Array(value :_*))
    @scala.inline
    def pr(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("pr", value.asInstanceOf[js.Any])
    @scala.inline
    def prNull: this.type = set("pr", null)
    @scala.inline
    def ptVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("pt", js.Array(value :_*))
    @scala.inline
    def pt(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def ptNull: this.type = set("pt", null)
    @scala.inline
    def pxVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("px", js.Array(value :_*))
    @scala.inline
    def px(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("px", value.asInstanceOf[js.Any])
    @scala.inline
    def pxNull: this.type = set("px", null)
    @scala.inline
    def pyVarargs(value: ((ThemeValue[space, RequiredTheme, js.Any]) | Null)*): this.type = set("py", js.Array(value :_*))
    @scala.inline
    def py(value: ResponsiveValue[ThemeValue[space, RequiredTheme, _], RequiredTheme]): this.type = set("py", value.asInstanceOf[js.Any])
    @scala.inline
    def pyNull: this.type = set("py", null)
    @scala.inline
    def rightVarargs(value: (js.Any | Null)*): this.type = set("right", js.Array(value :_*))
    @scala.inline
    def right(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.RightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def rightNull: this.type = set("right", null)
    @scala.inline
    def sizeVarargs(value: (js.Any | Null)*): this.type = set("size", js.Array(value :_*))
    @scala.inline
    def size(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def sizeNull: this.type = set("size", null)
    @scala.inline
    def topVarargs(value: (js.Any | Null)*): this.type = set("top", js.Array(value :_*))
    @scala.inline
    def top(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TopProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def topNull: this.type = set("top", null)
    @scala.inline
    def verticalAlignVarargs(value: (js.Any | Null)*): this.type = set("verticalAlign", js.Array(value :_*))
    @scala.inline
    def verticalAlign(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.VerticalAlignProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalAlignNull: this.type = set("verticalAlign", null)
    @scala.inline
    def widthVarargs(value: (js.Any | Null)*): this.type = set("width", js.Array(value :_*))
    @scala.inline
    def width(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.WidthProperty<TLengthStyledSystem> */ _, 
          RequiredTheme
        ]
    ): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def widthNull: this.type = set("width", null)
    @scala.inline
    def zIndexVarargs(value: (js.Any | Null)*): this.type = set("zIndex", js.Array(value :_*))
    @scala.inline
    def zIndex(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _, 
          RequiredTheme
        ]
    ): this.type = set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def zIndexNull: this.type = set("zIndex", null)
  }
  
  def withProps(p: BoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Box.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

