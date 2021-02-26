package typingsSlinky.simplecrawler

import typingsSlinky.simplecrawler.crawlerMod.HTTPMethods
import typingsSlinky.simplecrawler.queueMod.QueueItemStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simplecrawlerStrings {
  
  @js.native
  sealed trait CONNECT extends HTTPMethods
  @scala.inline
  def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @js.native
  sealed trait DELETE extends HTTPMethods
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET extends HTTPMethods
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD extends HTTPMethods
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait OPTIONS extends HTTPMethods
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH extends HTTPMethods
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST extends HTTPMethods
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends HTTPMethods
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait TRACE extends HTTPMethods
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
  
  @js.native
  sealed trait complete extends StObject
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait cookieerror extends StObject
  @scala.inline
  def cookieerror: cookieerror = "cookieerror".asInstanceOf[cookieerror]
  
  @js.native
  sealed trait crawlstart extends StObject
  @scala.inline
  def crawlstart: crawlstart = "crawlstart".asInstanceOf[crawlstart]
  
  @js.native
  sealed trait discoverycomplete extends StObject
  @scala.inline
  def discoverycomplete: discoverycomplete = "discoverycomplete".asInstanceOf[discoverycomplete]
  
  @js.native
  sealed trait downloadconditionerror extends StObject
  @scala.inline
  def downloadconditionerror: downloadconditionerror = "downloadconditionerror".asInstanceOf[downloadconditionerror]
  
  @js.native
  sealed trait downloaded extends QueueItemStatus
  @scala.inline
  def downloaded: downloaded = "downloaded".asInstanceOf[downloaded]
  
  @js.native
  sealed trait downloadprevented extends StObject
  @scala.inline
  def downloadprevented: downloadprevented = "downloadprevented".asInstanceOf[downloadprevented]
  
  @js.native
  sealed trait failed extends QueueItemStatus
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fetch404 extends StObject
  @scala.inline
  def fetch404: fetch404 = "fetch404".asInstanceOf[fetch404]
  
  @js.native
  sealed trait fetch410 extends StObject
  @scala.inline
  def fetch410: fetch410 = "fetch410".asInstanceOf[fetch410]
  
  @js.native
  sealed trait fetchclienterror extends StObject
  @scala.inline
  def fetchclienterror: fetchclienterror = "fetchclienterror".asInstanceOf[fetchclienterror]
  
  @js.native
  sealed trait fetchcomplete extends StObject
  @scala.inline
  def fetchcomplete: fetchcomplete = "fetchcomplete".asInstanceOf[fetchcomplete]
  
  @js.native
  sealed trait fetchconditionerror extends StObject
  @scala.inline
  def fetchconditionerror: fetchconditionerror = "fetchconditionerror".asInstanceOf[fetchconditionerror]
  
  @js.native
  sealed trait fetchdataerror extends StObject
  @scala.inline
  def fetchdataerror: fetchdataerror = "fetchdataerror".asInstanceOf[fetchdataerror]
  
  @js.native
  sealed trait fetchdisallowed extends StObject
  @scala.inline
  def fetchdisallowed: fetchdisallowed = "fetchdisallowed".asInstanceOf[fetchdisallowed]
  
  @js.native
  sealed trait fetcherror extends StObject
  @scala.inline
  def fetcherror: fetcherror = "fetcherror".asInstanceOf[fetcherror]
  
  @js.native
  sealed trait fetchheaders extends StObject
  @scala.inline
  def fetchheaders: fetchheaders = "fetchheaders".asInstanceOf[fetchheaders]
  
  @js.native
  sealed trait fetchprevented extends StObject
  @scala.inline
  def fetchprevented: fetchprevented = "fetchprevented".asInstanceOf[fetchprevented]
  
  @js.native
  sealed trait fetchredirect extends StObject
  @scala.inline
  def fetchredirect: fetchredirect = "fetchredirect".asInstanceOf[fetchredirect]
  
  @js.native
  sealed trait fetchstart extends StObject
  @scala.inline
  def fetchstart: fetchstart = "fetchstart".asInstanceOf[fetchstart]
  
  @js.native
  sealed trait fetchtimeout extends StObject
  @scala.inline
  def fetchtimeout: fetchtimeout = "fetchtimeout".asInstanceOf[fetchtimeout]
  
  @js.native
  sealed trait gziperror extends StObject
  @scala.inline
  def gziperror: gziperror = "gziperror".asInstanceOf[gziperror]
  
  @js.native
  sealed trait headers extends QueueItemStatus
  @scala.inline
  def headers: headers = "headers".asInstanceOf[headers]
  
  @js.native
  sealed trait invaliddomain extends StObject
  @scala.inline
  def invaliddomain: invaliddomain = "invaliddomain".asInstanceOf[invaliddomain]
  
  @js.native
  sealed trait notfound extends QueueItemStatus
  @scala.inline
  def notfound: notfound = "notfound".asInstanceOf[notfound]
  
  @js.native
  sealed trait notmodified extends StObject
  @scala.inline
  def notmodified: notmodified = "notmodified".asInstanceOf[notmodified]
  
  @js.native
  sealed trait queueadd extends StObject
  @scala.inline
  def queueadd: queueadd = "queueadd".asInstanceOf[queueadd]
  
  @js.native
  sealed trait queued extends QueueItemStatus
  @scala.inline
  def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait queueduplicate extends StObject
  @scala.inline
  def queueduplicate: queueduplicate = "queueduplicate".asInstanceOf[queueduplicate]
  
  @js.native
  sealed trait queueerror extends StObject
  @scala.inline
  def queueerror: queueerror = "queueerror".asInstanceOf[queueerror]
  
  @js.native
  sealed trait redirected extends QueueItemStatus
  @scala.inline
  def redirected: redirected = "redirected".asInstanceOf[redirected]
  
  @js.native
  sealed trait robotstxterror extends StObject
  @scala.inline
  def robotstxterror: robotstxterror = "robotstxterror".asInstanceOf[robotstxterror]
  
  @js.native
  sealed trait spooled extends QueueItemStatus
  @scala.inline
  def spooled: spooled = "spooled".asInstanceOf[spooled]
}
