/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * THIS FILE WAS GENERATED BY codergen. EDIT WITH CARE.
 */
package com.android.tools.idea.editors.gfxtrace.service.path;

import org.jetbrains.annotations.NotNull;

import com.android.tools.rpclib.binary.BinaryClass;
import com.android.tools.rpclib.binary.BinaryID;
import com.android.tools.rpclib.binary.BinaryObject;
import com.android.tools.rpclib.binary.Decoder;
import com.android.tools.rpclib.binary.Encoder;
import com.android.tools.rpclib.binary.Namespace;

import java.io.IOException;

public final class ThumbnailPath extends Path {
  @Override
  public StringBuilder stringPath(StringBuilder builder) {
    return myObject.stringPath(builder).append(".Thumbnail<").append(myDesiredWidth).append("x").append(myDesiredHeight).append(">");
  }

  //<<<Start:Java.ClassBody:1>>>
  private Path myObject;
  private int myDesiredWidth;
  private int myDesiredHeight;

  // Constructs a default-initialized {@link ThumbnailPath}.
  public ThumbnailPath() {}


  public Path getObject() {
    return myObject;
  }

  public ThumbnailPath setObject(Path v) {
    myObject = v;
    return this;
  }

  public int getDesiredWidth() {
    return myDesiredWidth;
  }

  public ThumbnailPath setDesiredWidth(int v) {
    myDesiredWidth = v;
    return this;
  }

  public int getDesiredHeight() {
    return myDesiredHeight;
  }

  public ThumbnailPath setDesiredHeight(int v) {
    myDesiredHeight = v;
    return this;
  }

  @Override @NotNull
  public BinaryClass klass() { return Klass.INSTANCE; }

  private static final byte[] IDBytes = {-50, 0, 103, 125, 72, -55, -48, 101, -27, -37, -102, -2, 112, 61, -112, -17, 18, 25, 83, 113, };
  public static final BinaryID ID = new BinaryID(IDBytes);

  static {
    Namespace.register(ID, Klass.INSTANCE);
  }
  public static void register() {}
  //<<<End:Java.ClassBody:1>>>
  public enum Klass implements BinaryClass {
    //<<<Start:Java.KlassBody:2>>>
    INSTANCE;

    @Override @NotNull
    public BinaryID id() { return ID; }

    @Override @NotNull
    public BinaryObject create() { return new ThumbnailPath(); }

    @Override
    public void encode(@NotNull Encoder e, BinaryObject obj) throws IOException {
      ThumbnailPath o = (ThumbnailPath)obj;
      e.object(o.myObject.unwrap());
      e.uint32(o.myDesiredWidth);
      e.uint32(o.myDesiredHeight);
    }

    @Override
    public void decode(@NotNull Decoder d, BinaryObject obj) throws IOException {
      ThumbnailPath o = (ThumbnailPath)obj;
      o.myObject = Path.wrap(d.object());
      o.myDesiredWidth = d.uint32();
      o.myDesiredHeight = d.uint32();
    }
    //<<<End:Java.KlassBody:2>>>
  }
}