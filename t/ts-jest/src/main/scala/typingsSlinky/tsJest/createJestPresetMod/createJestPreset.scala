package typingsSlinky.tsJest.createJestPresetMod

import typingsSlinky.jestTypes.configMod.InitialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-jest/dist/presets/create-jest-preset", "createJestPreset")
@js.native
object createJestPreset extends js.Object {
  
  def apply(): TsJestPresets = js.native
  def apply(hasAllowJs: js.UndefOr[scala.Nothing], from: InitialOptions): TsJestPresets = js.native
  def apply(hasAllowJs: CreateJestPresetOptions): TsJestPresets = js.native
  def apply(hasAllowJs: CreateJestPresetOptions, from: InitialOptions): TsJestPresets = js.native
}
