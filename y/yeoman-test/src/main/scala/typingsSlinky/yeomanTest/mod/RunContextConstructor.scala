package typingsSlinky.yeomanTest.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.yeomanGenerator.mod.GeneratorOptions
import typingsSlinky.yeomanGenerator.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunContextConstructor
  extends /**
  * This class provide a run context object to façade the complexity involved in setting
  * up a generator for testing
  * @param Generator - Namespace or generator constructor. If the later
  *                                      is provided, then namespace is assumed to be
  *                                      'gen:test' in all cases
  */
Instantiable1[
      (/* Generator */ Constructor[^[GeneratorOptions]]) | (/* Generator */ String), 
      RunContext
    ]
     with Instantiable2[
      (/* Generator */ Constructor[^[GeneratorOptions]]) | (/* Generator */ String), 
      /* settings */ RunContextSettings, 
      RunContext
    ]
