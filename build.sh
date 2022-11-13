./compile.sh
cd out/
jar --create --file vimjava.jar --manifest ../Manifest.txt -v *
mv vimjava.jar ../
cd ../
