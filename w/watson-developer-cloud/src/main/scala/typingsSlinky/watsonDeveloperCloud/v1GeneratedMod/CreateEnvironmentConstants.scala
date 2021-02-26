package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `createEnvironment` operation. */
object CreateEnvironmentConstants {
  
  @js.native
  sealed trait Size extends StObject
  /** Size of the environment. In the Lite plan the default and only accepted value is `LT`, in all other plans the default is `S`. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "CreateEnvironmentConstants.Size")
  @js.native
  object Size extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Size with String] = js.native
    
    @js.native
    sealed trait L extends Size
    /* "L" */ val L: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.L with String = js.native
    
    @js.native
    sealed trait LT extends Size
    /* "LT" */ val LT: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.LT with String = js.native
    
    @js.native
    sealed trait M extends Size
    /* "M" */ val M: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.M with String = js.native
    
    @js.native
    sealed trait ML extends Size
    /* "ML" */ val ML: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.ML with String = js.native
    
    @js.native
    sealed trait MS extends Size
    /* "MS" */ val MS: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.MS with String = js.native
    
    @js.native
    sealed trait S extends Size
    /* "S" */ val S: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.S with String = js.native
    
    @js.native
    sealed trait XL extends Size
    /* "XL" */ val XL: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XL with String = js.native
    
    @js.native
    sealed trait XS extends Size
    /* "XS" */ val XS: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XS with String = js.native
    
    @js.native
    sealed trait XXL extends Size
    /* "XXL" */ val XXL: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XXL with String = js.native
    
    @js.native
    sealed trait XXXL extends Size
    /* "XXXL" */ val XXXL: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.CreateEnvironmentConstants.Size.XXXL with String = js.native
  }
}
