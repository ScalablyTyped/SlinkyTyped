package typingsSlinky.vsoNodeApi.formInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputDataType extends StObject
@JSImport("vso-node-api/interfaces/common/FormInputInterfaces", "InputDataType")
@js.native
object InputDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InputDataType with Double] = js.native
  
  /**
    * Represents a value of true or false.
    */
  @js.native
  sealed trait Boolean extends InputDataType
  /* 30 */ val Boolean: typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDataType.Boolean with Double = js.native
  
  /**
    * Represents a Guid.
    */
  @js.native
  sealed trait Guid extends InputDataType
  /* 40 */ val Guid: typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDataType.Guid with Double = js.native
  
  /**
    * No data type is specified.
    */
  @js.native
  sealed trait None extends InputDataType
  /* 0 */ val None: typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDataType.None with Double = js.native
  
  /**
    * Represents a numberic value.
    */
  @js.native
  sealed trait Number extends InputDataType
  /* 20 */ val Number: typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDataType.Number with Double = js.native
  
  /**
    * Represents a textual value.
    */
  @js.native
  sealed trait String extends InputDataType
  /* 10 */ val String: typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDataType.String with Double = js.native
  
  /**
    * Represents a URI.
    */
  @js.native
  sealed trait Uri extends InputDataType
  /* 50 */ val Uri: typingsSlinky.vsoNodeApi.formInputInterfacesMod.InputDataType.Uri with Double = js.native
}
