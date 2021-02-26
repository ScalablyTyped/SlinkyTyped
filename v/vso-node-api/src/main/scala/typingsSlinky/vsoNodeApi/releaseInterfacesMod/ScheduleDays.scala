package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScheduleDays extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ScheduleDays")
@js.native
object ScheduleDays extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleDays with Double] = js.native
  
  @js.native
  sealed trait All extends ScheduleDays
  /* 127 */ val All: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ScheduleDays.All with Double = js.native
  
  @js.native
  sealed trait Friday extends ScheduleDays
  /* 16 */ val Friday: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Friday with Double = js.native
  
  @js.native
  sealed trait Monday extends ScheduleDays
  /* 1 */ val Monday: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Monday with Double = js.native
  
  @js.native
  sealed trait None extends ScheduleDays
  /* 0 */ val None: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ScheduleDays.None with Double = js.native
  
  @js.native
  sealed trait Saturday extends ScheduleDays
  /* 32 */ val Saturday: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Saturday with Double = js.native
  
  @js.native
  sealed trait Sunday extends ScheduleDays
  /* 64 */ val Sunday: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Sunday with Double = js.native
  
  @js.native
  sealed trait Thursday extends ScheduleDays
  /* 8 */ val Thursday: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Thursday with Double = js.native
  
  @js.native
  sealed trait Tuesday extends ScheduleDays
  /* 2 */ val Tuesday: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Tuesday with Double = js.native
  
  @js.native
  sealed trait Wednesday extends ScheduleDays
  /* 4 */ val Wednesday: typingsSlinky.vsoNodeApi.releaseInterfacesMod.ScheduleDays.Wednesday with Double = js.native
}
