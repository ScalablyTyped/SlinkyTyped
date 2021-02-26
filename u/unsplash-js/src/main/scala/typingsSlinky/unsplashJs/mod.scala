package typingsSlinky.unsplashJs

import org.scalajs.dom.experimental.Response
import typingsSlinky.unsplashJs.anon.AccessKey
import typingsSlinky.unsplashJs.anon.Bio
import typingsSlinky.unsplashJs.anon.Body
import typingsSlinky.unsplashJs.anon.C
import typingsSlinky.unsplashJs.anon.Links
import typingsSlinky.unsplashJs.anon.OrientationOrientation
import typingsSlinky.unsplashJs.mod.UnsplashApi.Auth
import typingsSlinky.unsplashJs.mod.UnsplashApi.Collections
import typingsSlinky.unsplashJs.mod.UnsplashApi.CurrentUser
import typingsSlinky.unsplashJs.mod.UnsplashApi.Photo
import typingsSlinky.unsplashJs.mod.UnsplashApi.Search
import typingsSlinky.unsplashJs.mod.UnsplashApi.Stats
import typingsSlinky.unsplashJs.mod.UnsplashApi.Users
import typingsSlinky.unsplashJs.unsplashJsStrings.days
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unsplash-js", JSImport.Default)
  @js.native
  class default protected () extends Unsplash {
    def this(options: AccessKey) = this()
  }
  
  @JSImport("unsplash-js", "toJson")
  @js.native
  def toJson(response: js.Any): js.Any = js.native
  
  type CollectionIds = js.Array[Double | String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.unsplashJs.unsplashJsStrings.high
    - typingsSlinky.unsplashJs.unsplashJsStrings.low
  */
  trait ContentSafety extends StObject
  object ContentSafety {
    
    @scala.inline
    def high: typingsSlinky.unsplashJs.unsplashJsStrings.high = "high".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.high]
    
    @scala.inline
    def low: typingsSlinky.unsplashJs.unsplashJsStrings.low = "low".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.low]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.unsplashJs.unsplashJsStrings.af
    - typingsSlinky.unsplashJs.unsplashJsStrings.am
    - typingsSlinky.unsplashJs.unsplashJsStrings.ar
    - typingsSlinky.unsplashJs.unsplashJsStrings.az
    - typingsSlinky.unsplashJs.unsplashJsStrings.be
    - typingsSlinky.unsplashJs.unsplashJsStrings.bg
    - typingsSlinky.unsplashJs.unsplashJsStrings.bn
    - typingsSlinky.unsplashJs.unsplashJsStrings.bs
    - typingsSlinky.unsplashJs.unsplashJsStrings.ca
    - typingsSlinky.unsplashJs.unsplashJsStrings.ceb
    - typingsSlinky.unsplashJs.unsplashJsStrings.co
    - typingsSlinky.unsplashJs.unsplashJsStrings.cs
    - typingsSlinky.unsplashJs.unsplashJsStrings.cy
    - typingsSlinky.unsplashJs.unsplashJsStrings.da
    - typingsSlinky.unsplashJs.unsplashJsStrings.de
    - typingsSlinky.unsplashJs.unsplashJsStrings.el
    - typingsSlinky.unsplashJs.unsplashJsStrings.en
    - typingsSlinky.unsplashJs.unsplashJsStrings.eo
    - typingsSlinky.unsplashJs.unsplashJsStrings.es
    - typingsSlinky.unsplashJs.unsplashJsStrings.et
    - typingsSlinky.unsplashJs.unsplashJsStrings.eu
    - typingsSlinky.unsplashJs.unsplashJsStrings.fa
    - typingsSlinky.unsplashJs.unsplashJsStrings.fi
    - typingsSlinky.unsplashJs.unsplashJsStrings.fr
    - typingsSlinky.unsplashJs.unsplashJsStrings.fy
    - typingsSlinky.unsplashJs.unsplashJsStrings.ga
    - typingsSlinky.unsplashJs.unsplashJsStrings.gd
    - typingsSlinky.unsplashJs.unsplashJsStrings.gl
    - typingsSlinky.unsplashJs.unsplashJsStrings.gu
    - typingsSlinky.unsplashJs.unsplashJsStrings.ha
    - typingsSlinky.unsplashJs.unsplashJsStrings.haw
    - typingsSlinky.unsplashJs.unsplashJsStrings.hi
    - typingsSlinky.unsplashJs.unsplashJsStrings.hmn
    - typingsSlinky.unsplashJs.unsplashJsStrings.hr
    - typingsSlinky.unsplashJs.unsplashJsStrings.ht
    - typingsSlinky.unsplashJs.unsplashJsStrings.hu
    - typingsSlinky.unsplashJs.unsplashJsStrings.hy
    - typingsSlinky.unsplashJs.unsplashJsStrings.id
    - typingsSlinky.unsplashJs.unsplashJsStrings.ig
    - typingsSlinky.unsplashJs.unsplashJsStrings.is
    - typingsSlinky.unsplashJs.unsplashJsStrings.it
    - typingsSlinky.unsplashJs.unsplashJsStrings.iw
    - typingsSlinky.unsplashJs.unsplashJsStrings.ja
    - typingsSlinky.unsplashJs.unsplashJsStrings.jw
    - typingsSlinky.unsplashJs.unsplashJsStrings.ka
    - typingsSlinky.unsplashJs.unsplashJsStrings.kk
    - typingsSlinky.unsplashJs.unsplashJsStrings.km
    - typingsSlinky.unsplashJs.unsplashJsStrings.kn
    - typingsSlinky.unsplashJs.unsplashJsStrings.ko
    - typingsSlinky.unsplashJs.unsplashJsStrings.ku
    - typingsSlinky.unsplashJs.unsplashJsStrings.ky
    - typingsSlinky.unsplashJs.unsplashJsStrings.la
    - typingsSlinky.unsplashJs.unsplashJsStrings.lb
    - typingsSlinky.unsplashJs.unsplashJsStrings.lo
    - typingsSlinky.unsplashJs.unsplashJsStrings.lt
    - typingsSlinky.unsplashJs.unsplashJsStrings.lv
    - typingsSlinky.unsplashJs.unsplashJsStrings.mg
    - typingsSlinky.unsplashJs.unsplashJsStrings.mi
    - typingsSlinky.unsplashJs.unsplashJsStrings.mk
    - typingsSlinky.unsplashJs.unsplashJsStrings.ml
    - typingsSlinky.unsplashJs.unsplashJsStrings.mn
    - typingsSlinky.unsplashJs.unsplashJsStrings.mr
    - typingsSlinky.unsplashJs.unsplashJsStrings.ms
    - typingsSlinky.unsplashJs.unsplashJsStrings.mt
    - typingsSlinky.unsplashJs.unsplashJsStrings.my
    - typingsSlinky.unsplashJs.unsplashJsStrings.ne
    - typingsSlinky.unsplashJs.unsplashJsStrings.nl
    - typingsSlinky.unsplashJs.unsplashJsStrings.no
    - typingsSlinky.unsplashJs.unsplashJsStrings.ny
    - typingsSlinky.unsplashJs.unsplashJsStrings.or
    - typingsSlinky.unsplashJs.unsplashJsStrings.pa
    - typingsSlinky.unsplashJs.unsplashJsStrings.pl
    - typingsSlinky.unsplashJs.unsplashJsStrings.ps
    - typingsSlinky.unsplashJs.unsplashJsStrings.pt
    - typingsSlinky.unsplashJs.unsplashJsStrings.ro
    - typingsSlinky.unsplashJs.unsplashJsStrings.ru
    - typingsSlinky.unsplashJs.unsplashJsStrings.rw
    - typingsSlinky.unsplashJs.unsplashJsStrings.sd
    - typingsSlinky.unsplashJs.unsplashJsStrings.si
    - typingsSlinky.unsplashJs.unsplashJsStrings.sk
    - typingsSlinky.unsplashJs.unsplashJsStrings.sl
    - typingsSlinky.unsplashJs.unsplashJsStrings.sm
    - typingsSlinky.unsplashJs.unsplashJsStrings.sn
    - typingsSlinky.unsplashJs.unsplashJsStrings.so
    - typingsSlinky.unsplashJs.unsplashJsStrings.sq
    - typingsSlinky.unsplashJs.unsplashJsStrings.sr
    - typingsSlinky.unsplashJs.unsplashJsStrings.st
    - typingsSlinky.unsplashJs.unsplashJsStrings.su
    - typingsSlinky.unsplashJs.unsplashJsStrings.sv
    - typingsSlinky.unsplashJs.unsplashJsStrings.sw
    - typingsSlinky.unsplashJs.unsplashJsStrings.ta
    - typingsSlinky.unsplashJs.unsplashJsStrings.te
    - typingsSlinky.unsplashJs.unsplashJsStrings.tg
    - typingsSlinky.unsplashJs.unsplashJsStrings.th
    - typingsSlinky.unsplashJs.unsplashJsStrings.tk
    - typingsSlinky.unsplashJs.unsplashJsStrings.tl
    - typingsSlinky.unsplashJs.unsplashJsStrings.tr
    - typingsSlinky.unsplashJs.unsplashJsStrings.tt
    - typingsSlinky.unsplashJs.unsplashJsStrings.ug
    - typingsSlinky.unsplashJs.unsplashJsStrings.uk
    - typingsSlinky.unsplashJs.unsplashJsStrings.ur
    - typingsSlinky.unsplashJs.unsplashJsStrings.uz
    - typingsSlinky.unsplashJs.unsplashJsStrings.vi
    - typingsSlinky.unsplashJs.unsplashJsStrings.xh
    - typingsSlinky.unsplashJs.unsplashJsStrings.yi
    - typingsSlinky.unsplashJs.unsplashJsStrings.yo
    - typingsSlinky.unsplashJs.unsplashJsStrings.zh
    - typingsSlinky.unsplashJs.unsplashJsStrings.`zh-TW`
    - typingsSlinky.unsplashJs.unsplashJsStrings.zu
  */
  trait Languages extends StObject
  object Languages {
    
    @scala.inline
    def af: typingsSlinky.unsplashJs.unsplashJsStrings.af = "af".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.af]
    
    @scala.inline
    def am: typingsSlinky.unsplashJs.unsplashJsStrings.am = "am".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.am]
    
    @scala.inline
    def ar: typingsSlinky.unsplashJs.unsplashJsStrings.ar = "ar".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ar]
    
    @scala.inline
    def az: typingsSlinky.unsplashJs.unsplashJsStrings.az = "az".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.az]
    
    @scala.inline
    def be: typingsSlinky.unsplashJs.unsplashJsStrings.be = "be".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.be]
    
    @scala.inline
    def bg: typingsSlinky.unsplashJs.unsplashJsStrings.bg = "bg".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.bg]
    
    @scala.inline
    def bn: typingsSlinky.unsplashJs.unsplashJsStrings.bn = "bn".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.bn]
    
    @scala.inline
    def bs: typingsSlinky.unsplashJs.unsplashJsStrings.bs = "bs".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.bs]
    
    @scala.inline
    def ca: typingsSlinky.unsplashJs.unsplashJsStrings.ca = "ca".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ca]
    
    @scala.inline
    def ceb: typingsSlinky.unsplashJs.unsplashJsStrings.ceb = "ceb".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ceb]
    
    @scala.inline
    def co: typingsSlinky.unsplashJs.unsplashJsStrings.co = "co".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.co]
    
    @scala.inline
    def cs: typingsSlinky.unsplashJs.unsplashJsStrings.cs = "cs".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.cs]
    
    @scala.inline
    def cy: typingsSlinky.unsplashJs.unsplashJsStrings.cy = "cy".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.cy]
    
    @scala.inline
    def da: typingsSlinky.unsplashJs.unsplashJsStrings.da = "da".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.da]
    
    @scala.inline
    def de: typingsSlinky.unsplashJs.unsplashJsStrings.de = "de".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.de]
    
    @scala.inline
    def el: typingsSlinky.unsplashJs.unsplashJsStrings.el = "el".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.el]
    
    @scala.inline
    def en: typingsSlinky.unsplashJs.unsplashJsStrings.en = "en".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.en]
    
    @scala.inline
    def eo: typingsSlinky.unsplashJs.unsplashJsStrings.eo = "eo".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.eo]
    
    @scala.inline
    def es: typingsSlinky.unsplashJs.unsplashJsStrings.es = "es".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.es]
    
    @scala.inline
    def et: typingsSlinky.unsplashJs.unsplashJsStrings.et = "et".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.et]
    
    @scala.inline
    def eu: typingsSlinky.unsplashJs.unsplashJsStrings.eu = "eu".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.eu]
    
    @scala.inline
    def fa: typingsSlinky.unsplashJs.unsplashJsStrings.fa = "fa".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.fa]
    
    @scala.inline
    def fi: typingsSlinky.unsplashJs.unsplashJsStrings.fi = "fi".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.fi]
    
    @scala.inline
    def fr: typingsSlinky.unsplashJs.unsplashJsStrings.fr = "fr".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.fr]
    
    @scala.inline
    def fy: typingsSlinky.unsplashJs.unsplashJsStrings.fy = "fy".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.fy]
    
    @scala.inline
    def ga: typingsSlinky.unsplashJs.unsplashJsStrings.ga = "ga".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ga]
    
    @scala.inline
    def gd: typingsSlinky.unsplashJs.unsplashJsStrings.gd = "gd".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.gd]
    
    @scala.inline
    def gl: typingsSlinky.unsplashJs.unsplashJsStrings.gl = "gl".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.gl]
    
    @scala.inline
    def gu: typingsSlinky.unsplashJs.unsplashJsStrings.gu = "gu".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.gu]
    
    @scala.inline
    def ha: typingsSlinky.unsplashJs.unsplashJsStrings.ha = "ha".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ha]
    
    @scala.inline
    def haw: typingsSlinky.unsplashJs.unsplashJsStrings.haw = "haw".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.haw]
    
    @scala.inline
    def hi: typingsSlinky.unsplashJs.unsplashJsStrings.hi = "hi".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.hi]
    
    @scala.inline
    def hmn: typingsSlinky.unsplashJs.unsplashJsStrings.hmn = "hmn".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.hmn]
    
    @scala.inline
    def hr: typingsSlinky.unsplashJs.unsplashJsStrings.hr = "hr".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.hr]
    
    @scala.inline
    def ht: typingsSlinky.unsplashJs.unsplashJsStrings.ht = "ht".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ht]
    
    @scala.inline
    def hu: typingsSlinky.unsplashJs.unsplashJsStrings.hu = "hu".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.hu]
    
    @scala.inline
    def hy: typingsSlinky.unsplashJs.unsplashJsStrings.hy = "hy".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.hy]
    
    @scala.inline
    def id: typingsSlinky.unsplashJs.unsplashJsStrings.id = "id".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.id]
    
    @scala.inline
    def ig: typingsSlinky.unsplashJs.unsplashJsStrings.ig = "ig".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ig]
    
    @scala.inline
    def is: typingsSlinky.unsplashJs.unsplashJsStrings.is = "is".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.is]
    
    @scala.inline
    def it: typingsSlinky.unsplashJs.unsplashJsStrings.it = "it".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.it]
    
    @scala.inline
    def iw: typingsSlinky.unsplashJs.unsplashJsStrings.iw = "iw".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.iw]
    
    @scala.inline
    def ja: typingsSlinky.unsplashJs.unsplashJsStrings.ja = "ja".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ja]
    
    @scala.inline
    def jw: typingsSlinky.unsplashJs.unsplashJsStrings.jw = "jw".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.jw]
    
    @scala.inline
    def ka: typingsSlinky.unsplashJs.unsplashJsStrings.ka = "ka".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ka]
    
    @scala.inline
    def kk: typingsSlinky.unsplashJs.unsplashJsStrings.kk = "kk".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.kk]
    
    @scala.inline
    def km: typingsSlinky.unsplashJs.unsplashJsStrings.km = "km".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.km]
    
    @scala.inline
    def kn: typingsSlinky.unsplashJs.unsplashJsStrings.kn = "kn".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.kn]
    
    @scala.inline
    def ko: typingsSlinky.unsplashJs.unsplashJsStrings.ko = "ko".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ko]
    
    @scala.inline
    def ku: typingsSlinky.unsplashJs.unsplashJsStrings.ku = "ku".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ku]
    
    @scala.inline
    def ky: typingsSlinky.unsplashJs.unsplashJsStrings.ky = "ky".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ky]
    
    @scala.inline
    def la: typingsSlinky.unsplashJs.unsplashJsStrings.la = "la".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.la]
    
    @scala.inline
    def lb: typingsSlinky.unsplashJs.unsplashJsStrings.lb = "lb".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.lb]
    
    @scala.inline
    def lo: typingsSlinky.unsplashJs.unsplashJsStrings.lo = "lo".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.lo]
    
    @scala.inline
    def lt: typingsSlinky.unsplashJs.unsplashJsStrings.lt = "lt".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.lt]
    
    @scala.inline
    def lv: typingsSlinky.unsplashJs.unsplashJsStrings.lv = "lv".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.lv]
    
    @scala.inline
    def mg: typingsSlinky.unsplashJs.unsplashJsStrings.mg = "mg".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.mg]
    
    @scala.inline
    def mi: typingsSlinky.unsplashJs.unsplashJsStrings.mi = "mi".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.mi]
    
    @scala.inline
    def mk: typingsSlinky.unsplashJs.unsplashJsStrings.mk = "mk".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.mk]
    
    @scala.inline
    def ml: typingsSlinky.unsplashJs.unsplashJsStrings.ml = "ml".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ml]
    
    @scala.inline
    def mn: typingsSlinky.unsplashJs.unsplashJsStrings.mn = "mn".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.mn]
    
    @scala.inline
    def mr: typingsSlinky.unsplashJs.unsplashJsStrings.mr = "mr".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.mr]
    
    @scala.inline
    def ms: typingsSlinky.unsplashJs.unsplashJsStrings.ms = "ms".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ms]
    
    @scala.inline
    def mt: typingsSlinky.unsplashJs.unsplashJsStrings.mt = "mt".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.mt]
    
    @scala.inline
    def my: typingsSlinky.unsplashJs.unsplashJsStrings.my = "my".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.my]
    
    @scala.inline
    def ne: typingsSlinky.unsplashJs.unsplashJsStrings.ne = "ne".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ne]
    
    @scala.inline
    def nl: typingsSlinky.unsplashJs.unsplashJsStrings.nl = "nl".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.nl]
    
    @scala.inline
    def no: typingsSlinky.unsplashJs.unsplashJsStrings.no = "no".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.no]
    
    @scala.inline
    def ny: typingsSlinky.unsplashJs.unsplashJsStrings.ny = "ny".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ny]
    
    @scala.inline
    def or: typingsSlinky.unsplashJs.unsplashJsStrings.or = "or".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.or]
    
    @scala.inline
    def pa: typingsSlinky.unsplashJs.unsplashJsStrings.pa = "pa".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.pa]
    
    @scala.inline
    def pl: typingsSlinky.unsplashJs.unsplashJsStrings.pl = "pl".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.pl]
    
    @scala.inline
    def ps: typingsSlinky.unsplashJs.unsplashJsStrings.ps = "ps".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ps]
    
    @scala.inline
    def pt: typingsSlinky.unsplashJs.unsplashJsStrings.pt = "pt".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.pt]
    
    @scala.inline
    def ro: typingsSlinky.unsplashJs.unsplashJsStrings.ro = "ro".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ro]
    
    @scala.inline
    def ru: typingsSlinky.unsplashJs.unsplashJsStrings.ru = "ru".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ru]
    
    @scala.inline
    def rw: typingsSlinky.unsplashJs.unsplashJsStrings.rw = "rw".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.rw]
    
    @scala.inline
    def sd: typingsSlinky.unsplashJs.unsplashJsStrings.sd = "sd".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.sd]
    
    @scala.inline
    def si: typingsSlinky.unsplashJs.unsplashJsStrings.si = "si".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.si]
    
    @scala.inline
    def sk: typingsSlinky.unsplashJs.unsplashJsStrings.sk = "sk".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.sk]
    
    @scala.inline
    def sl: typingsSlinky.unsplashJs.unsplashJsStrings.sl = "sl".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.sl]
    
    @scala.inline
    def sm: typingsSlinky.unsplashJs.unsplashJsStrings.sm = "sm".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.sm]
    
    @scala.inline
    def sn: typingsSlinky.unsplashJs.unsplashJsStrings.sn = "sn".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.sn]
    
    @scala.inline
    def so: typingsSlinky.unsplashJs.unsplashJsStrings.so = "so".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.so]
    
    @scala.inline
    def sq: typingsSlinky.unsplashJs.unsplashJsStrings.sq = "sq".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.sq]
    
    @scala.inline
    def sr: typingsSlinky.unsplashJs.unsplashJsStrings.sr = "sr".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.sr]
    
    @scala.inline
    def st: typingsSlinky.unsplashJs.unsplashJsStrings.st = "st".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.st]
    
    @scala.inline
    def su: typingsSlinky.unsplashJs.unsplashJsStrings.su = "su".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.su]
    
    @scala.inline
    def sv: typingsSlinky.unsplashJs.unsplashJsStrings.sv = "sv".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.sv]
    
    @scala.inline
    def sw: typingsSlinky.unsplashJs.unsplashJsStrings.sw = "sw".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.sw]
    
    @scala.inline
    def ta: typingsSlinky.unsplashJs.unsplashJsStrings.ta = "ta".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ta]
    
    @scala.inline
    def te: typingsSlinky.unsplashJs.unsplashJsStrings.te = "te".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.te]
    
    @scala.inline
    def tg: typingsSlinky.unsplashJs.unsplashJsStrings.tg = "tg".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.tg]
    
    @scala.inline
    def th: typingsSlinky.unsplashJs.unsplashJsStrings.th = "th".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.th]
    
    @scala.inline
    def tk: typingsSlinky.unsplashJs.unsplashJsStrings.tk = "tk".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.tk]
    
    @scala.inline
    def tl: typingsSlinky.unsplashJs.unsplashJsStrings.tl = "tl".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.tl]
    
    @scala.inline
    def tr: typingsSlinky.unsplashJs.unsplashJsStrings.tr = "tr".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.tr]
    
    @scala.inline
    def tt: typingsSlinky.unsplashJs.unsplashJsStrings.tt = "tt".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.tt]
    
    @scala.inline
    def ug: typingsSlinky.unsplashJs.unsplashJsStrings.ug = "ug".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ug]
    
    @scala.inline
    def uk: typingsSlinky.unsplashJs.unsplashJsStrings.uk = "uk".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.uk]
    
    @scala.inline
    def ur: typingsSlinky.unsplashJs.unsplashJsStrings.ur = "ur".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.ur]
    
    @scala.inline
    def uz: typingsSlinky.unsplashJs.unsplashJsStrings.uz = "uz".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.uz]
    
    @scala.inline
    def vi: typingsSlinky.unsplashJs.unsplashJsStrings.vi = "vi".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.vi]
    
    @scala.inline
    def xh: typingsSlinky.unsplashJs.unsplashJsStrings.xh = "xh".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.xh]
    
    @scala.inline
    def yi: typingsSlinky.unsplashJs.unsplashJsStrings.yi = "yi".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.yi]
    
    @scala.inline
    def yo: typingsSlinky.unsplashJs.unsplashJsStrings.yo = "yo".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.yo]
    
    @scala.inline
    def zh: typingsSlinky.unsplashJs.unsplashJsStrings.zh = "zh".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.zh]
    
    @scala.inline
    def `zh-TW`: typingsSlinky.unsplashJs.unsplashJsStrings.`zh-TW` = "zh-TW".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.`zh-TW`]
    
    @scala.inline
    def zu: typingsSlinky.unsplashJs.unsplashJsStrings.zu = "zu".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.zu]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.unsplashJs.unsplashJsStrings.portrait
    - typingsSlinky.unsplashJs.unsplashJsStrings.landscape
    - typingsSlinky.unsplashJs.unsplashJsStrings.squareish
  */
  trait Orientation extends StObject
  object Orientation {
    
    @scala.inline
    def landscape: typingsSlinky.unsplashJs.unsplashJsStrings.landscape = "landscape".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.landscape]
    
    @scala.inline
    def portrait: typingsSlinky.unsplashJs.unsplashJsStrings.portrait = "portrait".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.portrait]
    
    @scala.inline
    def squareish: typingsSlinky.unsplashJs.unsplashJsStrings.squareish = "squareish".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.squareish]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.unsplashJs.unsplashJsStrings.latest
    - typingsSlinky.unsplashJs.unsplashJsStrings.oldest
  */
  trait PhotoOrderBy extends StObject
  object PhotoOrderBy {
    
    @scala.inline
    def latest: typingsSlinky.unsplashJs.unsplashJsStrings.latest = "latest".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.latest]
    
    @scala.inline
    def oldest: typingsSlinky.unsplashJs.unsplashJsStrings.oldest = "oldest".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.oldest]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.unsplashJs.unsplashJsStrings.public
    - typingsSlinky.unsplashJs.unsplashJsStrings.read_user
    - typingsSlinky.unsplashJs.unsplashJsStrings.write_user
    - typingsSlinky.unsplashJs.unsplashJsStrings.read_photos
    - typingsSlinky.unsplashJs.unsplashJsStrings.write_photos
    - typingsSlinky.unsplashJs.unsplashJsStrings.write_likes
    - typingsSlinky.unsplashJs.unsplashJsStrings.write_followers
    - typingsSlinky.unsplashJs.unsplashJsStrings.read_collections
    - typingsSlinky.unsplashJs.unsplashJsStrings.write_collections
  */
  trait Scopes extends StObject
  object Scopes {
    
    @scala.inline
    def public: typingsSlinky.unsplashJs.unsplashJsStrings.public = "public".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.public]
    
    @scala.inline
    def read_collections: typingsSlinky.unsplashJs.unsplashJsStrings.read_collections = "read_collections".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.read_collections]
    
    @scala.inline
    def read_photos: typingsSlinky.unsplashJs.unsplashJsStrings.read_photos = "read_photos".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.read_photos]
    
    @scala.inline
    def read_user: typingsSlinky.unsplashJs.unsplashJsStrings.read_user = "read_user".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.read_user]
    
    @scala.inline
    def write_collections: typingsSlinky.unsplashJs.unsplashJsStrings.write_collections = "write_collections".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.write_collections]
    
    @scala.inline
    def write_followers: typingsSlinky.unsplashJs.unsplashJsStrings.write_followers = "write_followers".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.write_followers]
    
    @scala.inline
    def write_likes: typingsSlinky.unsplashJs.unsplashJsStrings.write_likes = "write_likes".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.write_likes]
    
    @scala.inline
    def write_photos: typingsSlinky.unsplashJs.unsplashJsStrings.write_photos = "write_photos".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.write_photos]
    
    @scala.inline
    def write_user: typingsSlinky.unsplashJs.unsplashJsStrings.write_user = "write_user".asInstanceOf[typingsSlinky.unsplashJs.unsplashJsStrings.write_user]
  }
  
  @js.native
  trait Unsplash extends StObject {
    
    var auth: Auth = js.native
    
    var collections: Collections = js.native
    
    var currentUser: CurrentUser = js.native
    
    var photos: Photo = js.native
    
    def request(requestOptions: Body): js.Promise[Response] = js.native
    
    var search: Search = js.native
    
    var stats: Stats = js.native
    
    var users: Users = js.native
  }
  object Unsplash {
    
    @scala.inline
    def apply(
      auth: Auth,
      collections: Collections,
      currentUser: CurrentUser,
      photos: Photo,
      request: Body => js.Promise[Response],
      search: Search,
      stats: Stats,
      users: Users
    ): Unsplash = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], currentUser = currentUser.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], request = js.Any.fromFunction1(request), search = search.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unsplash]
    }
    
    @scala.inline
    implicit class UnsplashMutableBuilder[Self <: Unsplash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollections(value: Collections): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUser(value: CurrentUser): Self = StObject.set(x, "currentUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhotos(value: Photo): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: Body => js.Promise[Response]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSearch(value: Search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  object UnsplashApi {
    
    @js.native
    trait Auth extends StObject {
      
      def getAuthenticationUrl(): String = js.native
      def getAuthenticationUrl(scopes: js.Array[Scopes]): String = js.native
      
      def setBearerToken(accessToken: String): Unit = js.native
      
      def userAuthentication(code: String): js.Promise[Response] = js.native
    }
    
    @js.native
    trait Collections extends StObject {
      
      def addPhotoToCollection(collectionId: Double, photoId: String): js.Promise[Response] = js.native
      
      def createCollection(title: String): js.Promise[Response] = js.native
      def createCollection(title: String, description: js.UndefOr[scala.Nothing], isPrivate: Boolean): js.Promise[Response] = js.native
      def createCollection(title: String, description: String): js.Promise[Response] = js.native
      def createCollection(title: String, description: String, isPrivate: Boolean): js.Promise[Response] = js.native
      
      def deleteCollection(id: Double): js.Promise[Response] = js.native
      
      def getCollection(id: Double): js.Promise[Response] = js.native
      
      def getCollectionPhotos(id: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: typingsSlinky.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: typingsSlinky.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: typingsSlinky.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typingsSlinky.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: typingsSlinky.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: typingsSlinky.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double, perPage: Double): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: typingsSlinky.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      def getCollectionPhotos(id: Double, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def getCollectionPhotos(
        id: Double,
        page: Double,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typingsSlinky.unsplashJs.anon.Orientation
      ): js.Promise[Response] = js.native
      
      def listCollections(): js.Promise[Response] = js.native
      def listCollections(page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def listCollections(page: Double): js.Promise[Response] = js.native
      def listCollections(page: Double, perPage: Double): js.Promise[Response] = js.native
      
      def listRelatedCollections(collectionId: Double): js.Promise[Response] = js.native
      
      def removePhotoFromCollection(collectionId: Double, photoId: String): js.Promise[Response] = js.native
      
      def updateCollection(id: Double): js.Promise[Response] = js.native
      def updateCollection(
        id: Double,
        title: js.UndefOr[scala.Nothing],
        description: js.UndefOr[scala.Nothing],
        isPrivate: Boolean
      ): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: js.UndefOr[scala.Nothing], description: String): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: js.UndefOr[scala.Nothing], description: String, isPrivate: Boolean): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String, description: js.UndefOr[scala.Nothing], isPrivate: Boolean): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String, description: String): js.Promise[Response] = js.native
      def updateCollection(id: Double, title: String, description: String, isPrivate: Boolean): js.Promise[Response] = js.native
    }
    
    @js.native
    trait CurrentUser extends StObject {
      
      def profile(): js.Promise[Response] = js.native
      
      def updateProfile(options: Bio): js.Promise[Response] = js.native
    }
    object CurrentUser {
      
      @scala.inline
      def apply(profile: () => js.Promise[Response], updateProfile: Bio => js.Promise[Response]): CurrentUser = {
        val __obj = js.Dynamic.literal(profile = js.Any.fromFunction0(profile), updateProfile = js.Any.fromFunction1(updateProfile))
        __obj.asInstanceOf[CurrentUser]
      }
      
      @scala.inline
      implicit class CurrentUserMutableBuilder[Self <: CurrentUser] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProfile(value: () => js.Promise[Response]): Self = StObject.set(x, "profile", js.Any.fromFunction0(value))
        
        @scala.inline
        def setUpdateProfile(value: Bio => js.Promise[Response]): Self = StObject.set(x, "updateProfile", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait Photo extends StObject {
      
      def downloadPhoto(photo: Links): js.Promise[Response] = js.native
      
      def getPhoto(id: String): js.Promise[Response] = js.native
      
      def getPhotoStats(id: String): js.Promise[Response] = js.native
      
      def getRandomPhoto(options: C): js.Promise[Response] = js.native
      
      def likePhoto(id: String): js.Promise[Response] = js.native
      
      def listPhotos(): js.Promise[Response] = js.native
      def listPhotos(page: js.UndefOr[scala.Nothing], perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def listPhotos(page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def listPhotos(page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def listPhotos(page: Double): js.Promise[Response] = js.native
      def listPhotos(page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def listPhotos(page: Double, perPage: Double): js.Promise[Response] = js.native
      def listPhotos(page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      
      def trackDownload(photo: Links): js.Promise[Response] = js.native
      
      def unlikePhoto(id: String): js.Promise[Response] = js.native
    }
    
    @js.native
    trait Search extends StObject {
      
      def collections(keyword: String): js.Promise[Response] = js.native
      def collections(keyword: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def collections(keyword: String, page: Double): js.Promise[Response] = js.native
      def collections(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      
      def photos(keyword: String): js.Promise[Response] = js.native
      def photos(
        keyword: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        filters: typingsSlinky.unsplashJs.anon.Collections
      ): js.Promise[Response] = js.native
      def photos(keyword: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def photos(
        keyword: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        filters: typingsSlinky.unsplashJs.anon.Collections
      ): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double): js.Promise[Response] = js.native
      def photos(
        keyword: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        filters: typingsSlinky.unsplashJs.anon.Collections
      ): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def photos(keyword: String, page: Double, perPage: Double, filters: typingsSlinky.unsplashJs.anon.Collections): js.Promise[Response] = js.native
      
      def users(keyword: String): js.Promise[Response] = js.native
      def users(keyword: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def users(keyword: String, page: Double): js.Promise[Response] = js.native
      def users(keyword: String, page: Double, perPage: Double): js.Promise[Response] = js.native
    }
    
    @js.native
    trait Stats extends StObject {
      
      def total(): js.Promise[Response] = js.native
    }
    object Stats {
      
      @scala.inline
      def apply(total: () => js.Promise[Response]): Stats = {
        val __obj = js.Dynamic.literal(total = js.Any.fromFunction0(total))
        __obj.asInstanceOf[Stats]
      }
      
      @scala.inline
      implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTotal(value: () => js.Promise[Response]): Self = StObject.set(x, "total", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait Users extends StObject {
      
      def collections(username: String): js.Promise[Response] = js.native
      def collections(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: String
      ): js.Promise[Response] = js.native
      def collections(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def collections(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: String): js.Promise[Response] = js.native
      def collections(username: String, page: Double): js.Promise[Response] = js.native
      def collections(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
      def collections(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def collections(username: String, page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
      
      def likes(username: String): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy
      ): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Double): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      def likes(username: String, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def likes(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: OrientationOrientation
      ): js.Promise[Response] = js.native
      
      def photos(username: String): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: typingsSlinky.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy
      ): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: typingsSlinky.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: typingsSlinky.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: js.UndefOr[scala.Nothing],
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typingsSlinky.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: js.UndefOr[scala.Nothing],
        options: typingsSlinky.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: js.UndefOr[scala.Nothing],
        orderBy: PhotoOrderBy,
        options: typingsSlinky.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: js.UndefOr[scala.Nothing],
        options: typingsSlinky.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      def photos(username: String, page: Double, perPage: Double, orderBy: PhotoOrderBy): js.Promise[Response] = js.native
      def photos(
        username: String,
        page: Double,
        perPage: Double,
        orderBy: PhotoOrderBy,
        options: typingsSlinky.unsplashJs.anon.Stats
      ): js.Promise[Response] = js.native
      
      def profile(username: String): js.Promise[Response] = js.native
      
      def statistics(username: String): js.Promise[Response] = js.native
      def statistics(username: String, resolution: js.UndefOr[scala.Nothing], quantity: Double): js.Promise[Response] = js.native
      @JSName("statistics")
      def statistics_days(username: String, resolution: days): js.Promise[Response] = js.native
      @JSName("statistics")
      def statistics_days(username: String, resolution: days, quantity: Double): js.Promise[Response] = js.native
    }
  }
}
