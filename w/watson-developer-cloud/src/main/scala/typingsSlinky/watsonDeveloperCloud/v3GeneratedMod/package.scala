package typingsSlinky.watsonDeveloperCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object v3GeneratedMod {
  
  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[typingsSlinky.axios.mod.AxiosResponse[T]], 
    scala.Unit
  ]
  
  /* static member */
  @scala.inline
  def URL: java.lang.String = typingsSlinky.watsonDeveloperCloud.v3GeneratedMod.^.asInstanceOf[js.Dynamic].selectDynamic("URL").asInstanceOf[java.lang.String]
  @scala.inline
  def URL_=(x: java.lang.String): scala.Unit = typingsSlinky.watsonDeveloperCloud.v3GeneratedMod.^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
}
