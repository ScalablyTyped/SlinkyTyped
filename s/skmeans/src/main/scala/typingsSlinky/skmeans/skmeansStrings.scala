package typingsSlinky.skmeans

import typingsSlinky.skmeans.mod.CentroidValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object skmeansStrings {
  @js.native
  sealed trait kmpp extends CentroidValues
  
  @js.native
  sealed trait kmrand extends CentroidValues
  
  @scala.inline
  def kmpp: kmpp = "kmpp".asInstanceOf[kmpp]
  @scala.inline
  def kmrand: kmrand = "kmrand".asInstanceOf[kmrand]
}

