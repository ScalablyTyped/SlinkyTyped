package typingsSlinky.storybookAddonKnobs

import typingsSlinky.std.PropertyKey
import typingsSlinky.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import typingsSlinky.storybookAddonKnobs.buttonMod.ButtonTypeOnClickProp
import typingsSlinky.storybookAddonKnobs.numberMod.NumberTypeKnobOptions
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsKnobOptions
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsTypeKnobSingleValue
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsTypeKnobValue
import typingsSlinky.storybookAddonKnobs.optionsMod.OptionsTypeOptionsProp
import typingsSlinky.storybookAddonKnobs.radioMod.RadiosTypeOptionsProp
import typingsSlinky.storybookAddonKnobs.selectMod.SelectTypeOptionsProp
import typingsSlinky.storybookAddonKnobs.typeDefsMod.Knob
import typingsSlinky.storybookAddonKnobs.typesMod.KnobType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/addon-knobs", "ADDON_ID")
  @js.native
  val ADDON_ID: /* "storybookjs/knobs" */ String = js.native
  
  @JSImport("@storybook/addon-knobs", "CHANGE")
  @js.native
  val CHANGE: String = js.native
  
  @JSImport("@storybook/addon-knobs", "CLICK")
  @js.native
  val CLICK: String = js.native
  
  @JSImport("@storybook/addon-knobs", "PANEL_ID")
  @js.native
  val PANEL_ID: String = js.native
  
  @JSImport("@storybook/addon-knobs", "PARAM_KEY")
  @js.native
  val PARAM_KEY: /* "knobs" */ String = js.native
  
  @JSImport("@storybook/addon-knobs", "RESET")
  @js.native
  val RESET: String = js.native
  
  @JSImport("@storybook/addon-knobs", "SET")
  @js.native
  val SET: String = js.native
  
  @JSImport("@storybook/addon-knobs", "SET_OPTIONS")
  @js.native
  val SET_OPTIONS: String = js.native
  
  @JSImport("@storybook/addon-knobs", "array")
  @js.native
  def array(name: String, value: ArrayTypeKnobValue): js.Array[String] = js.native
  @JSImport("@storybook/addon-knobs", "array")
  @js.native
  def array(name: String, value: ArrayTypeKnobValue, separator: js.UndefOr[scala.Nothing], groupId: String): js.Array[String] = js.native
  @JSImport("@storybook/addon-knobs", "array")
  @js.native
  def array(name: String, value: ArrayTypeKnobValue, separator: String): js.Array[String] = js.native
  @JSImport("@storybook/addon-knobs", "array")
  @js.native
  def array(name: String, value: ArrayTypeKnobValue, separator: String, groupId: String): js.Array[String] = js.native
  
  @JSImport("@storybook/addon-knobs", "boolean")
  @js.native
  def boolean(name: String, value: Boolean): Boolean = js.native
  @JSImport("@storybook/addon-knobs", "boolean")
  @js.native
  def boolean(name: String, value: Boolean, groupId: String): Boolean = js.native
  
  @JSImport("@storybook/addon-knobs", "button")
  @js.native
  def button(name: String, callback: ButtonTypeOnClickProp): js.UndefOr[scala.Nothing] = js.native
  @JSImport("@storybook/addon-knobs", "button")
  @js.native
  def button(name: String, callback: ButtonTypeOnClickProp, groupId: String): js.UndefOr[scala.Nothing] = js.native
  
  @JSImport("@storybook/addon-knobs", "color")
  @js.native
  def color(name: String, value: String): String = js.native
  @JSImport("@storybook/addon-knobs", "color")
  @js.native
  def color(name: String, value: String, groupId: String): String = js.native
  
  @JSImport("@storybook/addon-knobs", "date")
  @js.native
  def date(name: String): Double = js.native
  @JSImport("@storybook/addon-knobs", "date")
  @js.native
  def date(name: String, value: js.UndefOr[scala.Nothing], groupId: String): Double = js.native
  @JSImport("@storybook/addon-knobs", "date")
  @js.native
  def date(name: String, value: js.Date): Double = js.native
  @JSImport("@storybook/addon-knobs", "date")
  @js.native
  def date(name: String, value: js.Date, groupId: String): Double = js.native
  
  @JSImport("@storybook/addon-knobs", "files")
  @js.native
  def files(name: String, accept: String): js.Array[String] = js.native
  @JSImport("@storybook/addon-knobs", "files")
  @js.native
  def files(name: String, accept: String, value: js.UndefOr[scala.Nothing], groupId: String): js.Array[String] = js.native
  @JSImport("@storybook/addon-knobs", "files")
  @js.native
  def files(name: String, accept: String, value: js.Array[String]): js.Array[String] = js.native
  @JSImport("@storybook/addon-knobs", "files")
  @js.native
  def files(name: String, accept: String, value: js.Array[String], groupId: String): js.Array[String] = js.native
  
  @JSImport("@storybook/addon-knobs", "knob")
  @js.native
  def knob[T /* <: KnobType */, V](name: String, options: Knob[T]): V = js.native
  
  @JSImport("@storybook/addon-knobs", "number")
  @js.native
  def number(name: String, value: Double): Double = js.native
  @JSImport("@storybook/addon-knobs", "number")
  @js.native
  def number(name: String, value: Double, options: js.UndefOr[scala.Nothing], groupId: String): Double = js.native
  @JSImport("@storybook/addon-knobs", "number")
  @js.native
  def number(name: String, value: Double, options: NumberTypeKnobOptions): Double = js.native
  @JSImport("@storybook/addon-knobs", "number")
  @js.native
  def number(name: String, value: Double, options: NumberTypeKnobOptions, groupId: String): Double = js.native
  
  @JSImport("@storybook/addon-knobs", "optionsKnob")
  @js.native
  def optionsKnob[T /* <: OptionsTypeKnobSingleValue */](
    name: String,
    valuesObj: OptionsTypeOptionsProp[T],
    value: OptionsTypeKnobValue[T],
    optionsObj: OptionsKnobOptions
  ): T = js.native
  @JSImport("@storybook/addon-knobs", "optionsKnob")
  @js.native
  def optionsKnob[T /* <: OptionsTypeKnobSingleValue */](
    name: String,
    valuesObj: OptionsTypeOptionsProp[T],
    value: OptionsTypeKnobValue[T],
    optionsObj: OptionsKnobOptions,
    groupId: String
  ): T = js.native
  
  @JSImport("@storybook/addon-knobs", "radios")
  @js.native
  def radios(name: String, options: RadiosTypeOptionsProp[Null]): Null = js.native
  @JSImport("@storybook/addon-knobs", "radios")
  @js.native
  def radios(
    name: String,
    options: RadiosTypeOptionsProp[js.UndefOr[scala.Nothing]],
    value: js.UndefOr[scala.Nothing],
    groupId: String
  ): js.UndefOr[scala.Nothing] = js.native
  @JSImport("@storybook/addon-knobs", "radios")
  @js.native
  def radios(name: String, options: RadiosTypeOptionsProp[String], value: String): String = js.native
  @JSImport("@storybook/addon-knobs", "radios")
  @js.native
  def radios(name: String, options: RadiosTypeOptionsProp[String], value: String, groupId: String): String = js.native
  @JSImport("@storybook/addon-knobs", "radios")
  @js.native
  def radios(name: String, options: RadiosTypeOptionsProp[Double], value: Double): Double = js.native
  @JSImport("@storybook/addon-knobs", "radios")
  @js.native
  def radios(name: String, options: RadiosTypeOptionsProp[Double], value: Double, groupId: String): Double = js.native
  @JSImport("@storybook/addon-knobs", "radios")
  @js.native
  def radios(name: String, options: RadiosTypeOptionsProp[Null], value: Null, groupId: String): Null = js.native
  @JSImport("@storybook/addon-knobs", "radios")
  @js.native
  def radios_Union(name: String, options: RadiosTypeOptionsProp[js.UndefOr[scala.Nothing]]): js.UndefOr[scala.Nothing] = js.native
  
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(name: String, options: SelectTypeOptionsProp[Null]): Null = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(
    name: String,
    options: SelectTypeOptionsProp[js.UndefOr[scala.Nothing]],
    value: js.UndefOr[scala.Nothing],
    groupId: String
  ): js.UndefOr[scala.Nothing] = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(name: String, options: SelectTypeOptionsProp[String], value: String): String = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(name: String, options: SelectTypeOptionsProp[String], value: String, groupId: String): String = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(name: String, options: SelectTypeOptionsProp[js.Array[PropertyKey]], value: js.Array[PropertyKey]): js.Array[PropertyKey] = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(
    name: String,
    options: SelectTypeOptionsProp[js.Array[PropertyKey]],
    value: js.Array[PropertyKey],
    groupId: String
  ): js.Array[PropertyKey] = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(name: String, options: SelectTypeOptionsProp[Boolean], value: Boolean): Boolean = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(name: String, options: SelectTypeOptionsProp[Boolean], value: Boolean, groupId: String): Boolean = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(name: String, options: SelectTypeOptionsProp[Double], value: Double): Double = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(name: String, options: SelectTypeOptionsProp[Double], value: Double, groupId: String): Double = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select(name: String, options: SelectTypeOptionsProp[Null], value: Null, groupId: String): Null = js.native
  @JSImport("@storybook/addon-knobs", "select")
  @js.native
  def select_Union(name: String, options: SelectTypeOptionsProp[js.UndefOr[scala.Nothing]]): js.UndefOr[scala.Nothing] = js.native
  
  @JSImport("@storybook/addon-knobs", "text")
  @js.native
  def text(name: String, value: String): String = js.native
  @JSImport("@storybook/addon-knobs", "text")
  @js.native
  def text(name: String, value: String, groupId: String): String = js.native
  
  @JSImport("@storybook/addon-knobs", "withKnobs")
  @js.native
  def withKnobs(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any = js.native
  
  @JSImport("@storybook/addon-knobs", "object")
  @js.native
  def `object`[T](name: String, value: T): T = js.native
  @JSImport("@storybook/addon-knobs", "object")
  @js.native
  def `object`[T](name: String, value: T, groupId: String): T = js.native
}
