package typingsSlinky.swiz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("swiz", "Valve")
@js.native
class Valve protected () extends js.Object {
  def this(schema: IValveSchema) = this()
  def this(schema: IValveSchema, baton: js.Any) = this()
  
  def addChainValidator(
    name: String,
    description: String,
    func: js.Function2[
      /* value */ js.Any, 
      /* callback */ js.Function2[/* err */ js.Error, /* cleaned */ js.Any, Unit], 
      Unit
    ]
  ): Unit = js.native
  
  def addFinalValidator(
    func: js.Function2[
      /* obj */ js.Any, 
      /* callback */ js.Function2[/* err */ js.Error, /* cleaned */ js.Any, Unit], 
      Unit
    ]
  ): Valve = js.native
  
  def check(obj: js.Any, callback: js.Function2[/* err */ js.Any, /* cleaned */ js.Any, Unit]): Unit = js.native
  def check(
    obj: js.Any,
    options: ICheckOptions,
    callback: js.Function2[/* err */ js.Any, /* cleaned */ js.Any, Unit]
  ): Unit = js.native
  
  def checkUpdate(
    existing: js.Any,
    obj: js.Any,
    callback: js.Function2[/* err */ js.Any, /* cleaned */ js.Any, Unit]
  ): Unit = js.native
  
  def help(schema: IValveSchema): js.Any = js.native
  
  def setSchema(schema: IValveSchema): Valve = js.native
}
