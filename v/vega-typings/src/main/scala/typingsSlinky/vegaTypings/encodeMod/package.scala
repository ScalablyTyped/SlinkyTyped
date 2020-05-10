package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object encodeMod {
  type AlignValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.encodeMod.Align]
  type AnchorValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.titleMod.TitleAnchor]
  type ArbitraryValueRef = typingsSlinky.vegaTypings.encodeMod.NumericValueRef | typingsSlinky.vegaTypings.encodeMod.ColorValueRef | typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[js.Any]
  type ArrayValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[js.Array[js.Any]]
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsSlinky.vegaTypings.vegaTypingsStrings.multiply
    - typingsSlinky.vegaTypings.vegaTypingsStrings.screen
    - typingsSlinky.vegaTypings.vegaTypingsStrings.overlay
    - typingsSlinky.vegaTypings.vegaTypingsStrings.darken
    - typingsSlinky.vegaTypings.vegaTypingsStrings.lighten
    - typingsSlinky.vegaTypings.vegaTypingsStrings.`color-dodge`
    - typingsSlinky.vegaTypings.vegaTypingsStrings.`color-burn`
    - typingsSlinky.vegaTypings.vegaTypingsStrings.`hard-light`
    - typingsSlinky.vegaTypings.vegaTypingsStrings.`soft-light`
    - typingsSlinky.vegaTypings.vegaTypingsStrings.difference
    - typingsSlinky.vegaTypings.vegaTypingsStrings.exclusion
    - typingsSlinky.vegaTypings.vegaTypingsStrings.hue
    - typingsSlinky.vegaTypings.vegaTypingsStrings.saturation
    - typingsSlinky.vegaTypings.vegaTypingsStrings.color
    - typingsSlinky.vegaTypings.vegaTypingsStrings.luminosity
  */
  type Blend = typingsSlinky.vegaTypings.encodeMod._Blend | scala.Null
  type BooleanValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[scala.Boolean]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.colorMod.Color]
    - typingsSlinky.vegaTypings.Anon0
    - typingsSlinky.vegaTypings.AnonCount
    - typingsSlinky.vegaTypings.AnonColor
  */
  type ColorValueRef = typingsSlinky.vegaTypings.encodeMod._ColorValueRef | typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.colorMod.Color]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.vegaTypings.signalMod.SignalRef
    - typingsSlinky.vegaTypings.encodeMod.DatumFieldRef
    - typingsSlinky.vegaTypings.encodeMod.GroupFieldRef
    - typingsSlinky.vegaTypings.encodeMod.ParentFieldRef
  */
  type Field = typingsSlinky.vegaTypings.encodeMod._Field | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.normal
    - typingsSlinky.vegaTypings.vegaTypingsStrings.italic
    - typingsSlinky.vegaTypings.vegaTypingsStrings.oblique
    - java.lang.String
  */
  type FontStyle = typingsSlinky.vegaTypings.encodeMod._FontStyle | java.lang.String
  type FontStyleValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.encodeMod.FontStyle]
  type FontWeightValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.encodeMod.FontWeight]
  type NumericValueRef = (typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[scala.Double] | js.Object) with typingsSlinky.vegaTypings.AnonExponent
  type OrientValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.encodeMod.Orient]
  type ProductionRule[T] = T | (js.Array[typingsSlinky.vegaTypings.AnonTest with T])
  type RuleEncodeEntry = typingsSlinky.vegaTypings.encodeMod.EncodeEntry
  type StringValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.vegaTypingsStrings.circle
    - typingsSlinky.vegaTypings.vegaTypingsStrings.square
    - typingsSlinky.vegaTypings.vegaTypingsStrings.cross
    - typingsSlinky.vegaTypings.vegaTypingsStrings.diamond
    - typingsSlinky.vegaTypings.vegaTypingsStrings.`triangle-up`
    - typingsSlinky.vegaTypings.vegaTypingsStrings.`triangle-down`
    - typingsSlinky.vegaTypings.vegaTypingsStrings.`triangle-right`
    - typingsSlinky.vegaTypings.vegaTypingsStrings.`triangle-left`
    - typingsSlinky.vegaTypings.vegaTypingsStrings.arrow
    - typingsSlinky.vegaTypings.vegaTypingsStrings.triangle
    - typingsSlinky.vegaTypings.vegaTypingsStrings.wedge
    - typingsSlinky.vegaTypings.vegaTypingsStrings.stroke
    - java.lang.String
  */
  type SymbolShape = typingsSlinky.vegaTypings.encodeMod._SymbolShape | java.lang.String
  type SymbolShapeValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.encodeMod.SymbolShape]
  type Text = java.lang.String | js.Array[java.lang.String]
  type TextBaselineValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.encodeMod.TextBaseline]
  type TextValueRef = typingsSlinky.vegaTypings.encodeMod.ScaledValueRef[typingsSlinky.vegaTypings.encodeMod.Text]
}
