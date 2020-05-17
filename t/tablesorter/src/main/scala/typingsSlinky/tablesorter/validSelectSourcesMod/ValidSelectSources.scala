package typingsSlinky.tablesorter.validSelectSourcesMod

import typingsSlinky.tablesorter.selectSourceMod.SelectSource
import typingsSlinky.tablesorter.selectSourcesMod.SelectSources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Null
  - js.Array[java.lang.String | typingsSlinky.tablesorter.selectSourceMod.SelectSource]
*/
trait ValidSelectSources
  extends SelectSources[js.Any]

object ValidSelectSources {
  @scala.inline
  implicit def apply(value: js.Array[String | SelectSource]): ValidSelectSources = value.asInstanceOf[ValidSelectSources]
  @scala.inline
  implicit def apply(value: Null): ValidSelectSources = value.asInstanceOf[ValidSelectSources]
  @scala.inline
  implicit def apply(value: String): ValidSelectSources = value.asInstanceOf[ValidSelectSources]
}

