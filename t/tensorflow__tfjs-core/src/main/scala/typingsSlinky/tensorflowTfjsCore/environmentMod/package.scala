package typingsSlinky.tensorflowTfjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object environmentMod {
  
  type FlagEvaluationFn = js.Function0[
    typingsSlinky.tensorflowTfjsCore.environmentMod.FlagValue | js.Promise[typingsSlinky.tensorflowTfjsCore.environmentMod.FlagValue]
  ]
  
  type FlagValue = scala.Double | scala.Boolean
  
  type Flags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.tensorflowTfjsCore.environmentMod.FlagValue]
}
