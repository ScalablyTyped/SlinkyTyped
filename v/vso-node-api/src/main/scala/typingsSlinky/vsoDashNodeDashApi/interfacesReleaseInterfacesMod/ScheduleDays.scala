package typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScheduleDays extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ScheduleDays")
@js.native
object ScheduleDays extends js.Object {
  @js.native
  sealed trait All extends ScheduleDays
  
  @js.native
  sealed trait Friday extends ScheduleDays
  
  @js.native
  sealed trait Monday extends ScheduleDays
  
  @js.native
  sealed trait None extends ScheduleDays
  
  @js.native
  sealed trait Saturday extends ScheduleDays
  
  @js.native
  sealed trait Sunday extends ScheduleDays
  
  @js.native
  sealed trait Thursday extends ScheduleDays
  
  @js.native
  sealed trait Tuesday extends ScheduleDays
  
  @js.native
  sealed trait Wednesday extends ScheduleDays
  
  /* 127 */ val All: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.All with Double = js.native
  /* 16 */ val Friday: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Friday with Double = js.native
  /* 1 */ val Monday: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Monday with Double = js.native
  /* 0 */ val None: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.None with Double = js.native
  /* 32 */ val Saturday: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Saturday with Double = js.native
  /* 64 */ val Sunday: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Sunday with Double = js.native
  /* 8 */ val Thursday: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Thursday with Double = js.native
  /* 2 */ val Tuesday: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Tuesday with Double = js.native
  /* 4 */ val Wednesday: typingsSlinky.vsoDashNodeDashApi.interfacesReleaseInterfacesMod.ScheduleDays.Wednesday with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScheduleDays with Double] = js.native
}

