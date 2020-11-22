package typingsSlinky.tsJest.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jestTypes.configMod.InitialOptions
import typingsSlinky.tsJest.createJestPresetMod.CreateJestPresetOptions
import typingsSlinky.tsJest.createJestPresetMod.TsJestPresets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-jest", "createJestPreset")
@js.native
object createJestPreset
  extends TopLevel[
      js.Function2[
        /* hasAllowJs */ js.UndefOr[CreateJestPresetOptions], 
        /* from */ js.UndefOr[InitialOptions], 
        TsJestPresets
      ]
    ]
